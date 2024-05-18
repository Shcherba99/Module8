package com.goit.module8.psherba.service;

import com.goit.module8.psherba.shapes.Shape;

public class ShapeNamePrinter implements NamePrinter {

    @Override
    public void printName(Shape shape) {
        System.out.println("Shape name: " + shape.getShapeName());
    }
}
