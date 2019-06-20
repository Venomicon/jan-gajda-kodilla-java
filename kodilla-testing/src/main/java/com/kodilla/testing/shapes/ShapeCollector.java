package com.kodilla.testing.shapes;

import java.util.*;

public class ShapeCollector {
    ArrayList<Shape> figures = new ArrayList<Shape>();

    public int getFiguresSize() {
        return figures.size();
    }

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
        figures.remove(shape);
        result = true;
        }
        return result;
    }

    public Shape getFigure(int figureNumber) {
        Shape theShape = null;
        if (figureNumber >= 0 && figureNumber < figures.size()) {
            theShape = figures.get(figureNumber);
        }
        return theShape;
    }

    public void showFigures() {
        int counter = 0;
        for(Shape shape: figures) {
            System.out.println(shape);
            counter++;
        }
    }

}
