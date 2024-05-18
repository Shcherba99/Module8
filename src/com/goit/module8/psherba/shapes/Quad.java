package com.goit.module8.psherba.shapes;

import java.awt.*;
import java.util.Objects;

public class Quad extends Shape {
    private int width;
    private int height;


    public Quad(double x, double y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Quad";
    }

    @Override
    public void add() {
        System.out.println("________________________________________");
        System.out.println("Quad added.");
        System.out.println("Params: ");
        System.out.printf("x: %s \n", getX());
        System.out.printf("y: %s \n", getY());
        System.out.printf("width: %s \n", width);
        System.out.printf("height: %s \n", height);
        System.out.printf("Color: %s \n", getColor());
        System.out.println("________________________________________");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Quad quad = (Quad) o;
        return width == quad.width && height == quad.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }
}
