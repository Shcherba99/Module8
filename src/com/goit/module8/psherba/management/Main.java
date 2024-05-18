package com.goit.module8.psherba.management;

import com.goit.module8.psherba.service.NamePrinter;
import com.goit.module8.psherba.service.ShapeNamePrinter;
import com.goit.module8.psherba.shapes.*;
import com.goit.module8.psherba.shapes.Label;
import com.goit.module8.psherba.shapes.Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1.0, 2.0, 3, Color.YELLOW));
        shapes.add(new Quad(4.0, 5.0, 6, 7, Color.GRAY));
        shapes.add(new Triangle(8.0, 9.0, 10.0, 11, 12.0, 13.0, Color.RED));
        shapes.add(new Label(14.0, 15.0, "GoIt", Color.ORANGE));
        shapes.add(new Line(16.0, 17.0, Color.BLACK));

        NamePrinter shapeNamePrinter = new ShapeNamePrinter();
        shapes.forEach(shapeNamePrinter::printName);

        shapes.forEach(Shape::add);
    }
}