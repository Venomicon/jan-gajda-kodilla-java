package com.kodilla;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {


    public Tile(int x, int y) {
        setWidth(RoyalGameOfUr.TILE_SIZE);
        setHeight(RoyalGameOfUr.TILE_SIZE);

        setFill(Color.TRANSPARENT);

        relocate(x * RoyalGameOfUr.TILE_SIZE, y*RoyalGameOfUr.TILE_SIZE);
    }
}
