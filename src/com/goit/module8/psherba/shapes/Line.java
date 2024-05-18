package com.goit.module8.psherba.shapes;

import java.awt.*;

public class Line extends Shape {

    public Line(double x, double y, Color color) {
        super(x, y, color);
    }

    @Override
    public String getShapeName() {
        return "Line";
    }

    @Override
    public void add() {
        System.out.println("________________________________________");
        System.out.println("Line added.");
        System.out.println("Params: ");
        System.out.printf("x: %s \n", getX());
        System.out.printf("y: %s \n", getY());
        System.out.printf("Color: %s \n", getColor());
        System.out.println("________________________________________");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
