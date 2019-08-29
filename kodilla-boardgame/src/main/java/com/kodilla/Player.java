package com.kodilla;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Player {
    final int player;

    public Player(int player) {
        if (player == 1 || player == 2) {
            this.player = player;
        } else {
            System.out.println("Incorrect player number");
            throw new IndexOutOfBoundsException();
        }
    }


}
