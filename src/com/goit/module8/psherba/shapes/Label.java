package com.goit.module8.psherba.shapes;

import java.awt.*;
import java.util.Objects;

public class Label extends Shape {
    private String text;

    public Label(double x, double y, String text, Color color) {
        super(x, y, color);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getShapeName() {
        return "Label";
    }

    @Override
    public void add() {
        System.out.println("________________________________________");
        System.out.println("Label added.");
        System.out.println("Params: ");
        System.out.printf("x: %s \n", getX());
        System.out.printf("y: %s \n", getY());
        System.out.printf("Text: %s \n", text);
        System.out.printf("Color: %s \n", getColor());
        System.out.println("________________________________________");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Label label = (Label) o;
        return Objects.equals(text, label.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }
}
