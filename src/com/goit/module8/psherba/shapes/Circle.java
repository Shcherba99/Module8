package com.goit.module8.psherba.shapes;

import java.awt.*;
import java.util.Objects;

public class Circle extends Shape {
    private int radius;

    public Circle(double x, double y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }


    @Override
    public String getShapeName() {
       return "Circle";
    }


    @Override
    public void add() {
        System.out.println("________________________________________");
        System.out.println("Circle added.");
        System.out.println("Params: ");
        System.out.printf("x: %s \n", getX());
        System.out.printf("y: %s \n", getY());
        System.out.printf("Radius: %s \n", radius);
        System.out.printf("Color: %s \n", getColor());
        System.out.println("________________________________________");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
