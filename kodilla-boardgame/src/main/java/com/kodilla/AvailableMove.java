package com.kodilla;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class AvailableMove extends  Rectangle{
    public AvailableMove() {
        super(150, 150);
        setFill(Color.TRANSPARENT);
        setStroke(Color.GREEN);
        setStrokeWidth(6);
    }
}
