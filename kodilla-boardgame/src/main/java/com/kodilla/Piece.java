package com.kodilla;

import javafx.scene.Cursor;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Piece extends Circle {
    private double mouseX, mouseY;
    private double oldX, oldY;
    final int player;

    public Piece(int player) {
        super(50);
        setStroke(Color.BLACK);
        setStrokeWidth(4);
        if(player == 1) {
            setFill(Color.BLUE);
        } else if (player == 2) {
            setFill(Color.RED);
        }
        this.player = player;

        setOnMousePressed(e -> {
            mouseX = e.getSceneX();
            mouseY = e.getSceneY();
        });

        setOnMouseDragged(e -> {
            setCursor(Cursor.CLOSED_HAND);

        });
    }

    public int getPlayer() {
        if(player == 1) {
            return 1;
        }else{
            return 2;
        }
    }
}
