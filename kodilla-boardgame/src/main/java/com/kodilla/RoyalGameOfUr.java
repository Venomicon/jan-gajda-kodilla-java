package com.kodilla;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.Scene;
import sun.swing.MenuItemLayoutHelper;

public class RoyalGameOfUr extends Application{
    private Image imageback = new Image("file:src/main/resources/BoardGame/board.png");
    private FlowPane pieces = new FlowPane(Orientation.HORIZONTAL);
    BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
    BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.ROUND, BackgroundRepeat.ROUND, BackgroundPosition.CENTER, backgroundSize);
    Background background = new Background(backgroundImage);

    public static final double TILE_SIZE = 152;
    public static final int WIDTH = 8;
    public static final int HEIGHT = 3;

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setBackground(background);
        grid.setGridLinesVisible(true);
        grid.setPadding(new Insets(0,0,0,0));
        for(int x=0; x<WIDTH; x++) {
            for(int y=0; y<HEIGHT; y++){
                Tile tile = new Tile(x, y);

                grid.add(tile, x, y);
            }
        }
        ColumnConstraints cc = new ColumnConstraints();
        cc.setHalignment(HPos.CENTER);
        RowConstraints rc = new RowConstraints();
        rc.setValignment(VPos.CENTER);
        grid.getColumnConstraints().addAll(cc);
        grid.getRowConstraints().addAll(rc);


        int s1 = 0;
        int s2 = 0;
        Label score = new Label("First to 7 wins!      ");
        Label score2 = new Label(s1 + " - " + s2 + "     ");
        score.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
        score2.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));
        VBox scorebox = new VBox(score, score2);
        scorebox.setAlignment(Pos.CENTER);
        scorebox.setSpacing(10);
        Label rollResult = new Label("Result:    ");
        rollResult.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 14));
        Button diceRoll = new Button();
        diceRoll.setText("Roll dice");
        diceRoll.setOnAction((e) -> {
            int result = Dice.roll();
            rollResult.setText("Result:  "+result);
        });
        Tooltip tooltip1 = new Tooltip("Rolls 4 tetrahedral dice.");
        diceRoll.setTooltip(tooltip1);

        VBox buttons = new VBox(diceRoll, rollResult);
        buttons.setAlignment(Pos.CENTER);
        buttons.setPadding(new Insets(0,50,0,0));
        buttons.setSpacing(10);

        Piece piece1 = new Piece(2);
        Piece piece2 = new Piece(1);

        grid.add(piece1, 0, 0);
        grid.add(piece2, 2, 0);
        grid.add(scorebox,4,0);
        grid.add(buttons, 4, 2);
        ObservableList<ColumnConstraints> columnConstraints = grid.getColumnConstraints();
        System.out.println(columnConstraints);


        ToolBar toolbar = new ToolBar();
        toolbar.getItems().add(diceRoll);

        Scene scene = new Scene(grid, 1200, 450, Color.WHITE);
        scene.setCursor(Cursor.OPEN_HAND);

        diceRoll.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                scene.setCursor(Cursor.HAND);
            }
        });
        diceRoll.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                scene.setCursor(Cursor.OPEN_HAND);
            }
        });

        primaryStage.setTitle("Royal Game of Ur");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
