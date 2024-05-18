package com.goit.module8.psherba.shapes;

import java.awt.*;
import java.util.Objects;

public class Triangle extends Shape {
    private double xB;
    private double yB;
    private double xC;
    private double yC;

    public Triangle(double xA, double yA, double xB, double yB, double xC, double yC, Color color) {
        super(xA, yA, color);
        this.xB = xB;
        this.yB = yB;
        this.xC = xC;
        this.yC = yC;
    }

    public double getXb() {
        return xB;
    }

    public void setXb(double xB) {
        this.xB = xB;
    }

    public double getYb() {
        return yB;
    }

    public void setYb(double yB) {
        this.yB = yB;
    }

    public double getXc() {
        return xC;
    }

    public void setXc(double xC) {
        this.xC = xC;
    }

    public double getYc() {
        return yC;
    }

    public void setYc(double yC) {
        this.yC = yC;
    }


    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public void add() {
        System.out.println("________________________________________");
        System.out.println("Triangle added.");
        System.out.println("Params: ");
        System.out.printf("xA: %s \n", getX());
        System.out.printf("yA: %s \n", getY());
        System.out.printf("xB: %s \n", xB);
        System.out.printf("yB: %s \n", yB);
        System.out.printf("xC: %s \n", xC);
        System.out.printf("yC: %s \n", yC);
        System.out.printf("Color: %s \n", getColor());
        System.out.println("________________________________________");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(xB, triangle.xB) == 0 &&
                Double.compare(yB, triangle.yB) == 0 &&
                Double.compare(xC, triangle.xC) == 0 &&
                Double.compare(yC, triangle.yC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), xB, yB, xC, yC);
    }
}
