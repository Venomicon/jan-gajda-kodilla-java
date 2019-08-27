package com.kodilla;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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

import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends Application{
    private Image imageback = new Image("file:src/main/resources/TicTacToe.png");
    //BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
    //BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
    //Background background = new Background(backgroundImage);
    boolean PlayerTurn = true;
    int buttonCount = 0;

    public static void main(String args[]) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label();
        HBox hBox = new HBox(label);
        hBox.setAlignment(Pos.TOP_CENTER);
        hBox.setPadding(new Insets(10,0,0,0));
        label.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 20));

        GridPane grid = new GridPane();
        grid.setGridLinesVisible(true);
        grid.setPrefWidth(200);
        grid.setPrefHeight(200);
        grid.setAlignment(Pos.BOTTOM_CENTER);

        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        Button b4 = new Button();
        Button b5 = new Button();
        Button b6 = new Button();
        Button b7 = new Button();
        Button b8 = new Button();
        Button b9 = new Button();
        Button[] buttons = new Button[8];
        buttons[0] = b1;
        buttons[1] = b2;
        buttons[2] = b3;
        buttons[3] = b4;
        buttons[4] = b5;
        buttons[5] = b6;
        buttons[6] = b7;
        buttons[7] = b8;
        buttons[8] = b9;

        b1.setOnAction(event -> {
            if (PlayerTurn) {
                b1.setText("X");
                b1.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 72));
                label.setText("");
                PlayerTurn = false;
                b1.setDisable(true);
            } else {
                b1.setText("O");
                b1.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 72));
                label.setText("");
                PlayerTurn = true;
                b1.setDisable(true);
            }
        });

        b1.setMinSize(grid.getPrefWidth(),grid.getPrefHeight());
        b1.setOnMouseEntered(event -> {
            b1.setCursor(Cursor.HAND);
        });
        b1.setOnMouseExited(event -> {
            b1.setCursor(Cursor.OPEN_HAND);
        });
    

        grid.add(b1,0,0);
        grid.add(b2,1,0);
        grid.add(b3,2,0);
        grid.add(b4,0,1);
        grid.add(b5,1,1);
        grid.add(b6,2,1);
        grid.add(b7,0,2);
        grid.add(b8,1,2);
        grid.add(b9,2,2);


        StackPane root = new StackPane();
        root.getChildren().addAll(hBox,grid);


        Scene scene = new Scene(root, 600, 640);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
