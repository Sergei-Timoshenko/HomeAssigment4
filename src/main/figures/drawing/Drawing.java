package main.figures.drawing;

import main.figures.interfaces.Shape;

import java.awt.*;

public class Drawing {
    public Shape getShape(String name) {
        return () -> name;
    }
}
