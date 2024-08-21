package org.example.Figure.calculator.impl;

import org.example.Figure.calculator.FigureCalculator;
import org.example.Figure.Rectangle;

public class RectangleCalculator implements FigureCalculator<Rectangle> {

    @Override
    public double calculateArea(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }

    @Override
    public double calculatePerimeter(Rectangle rectangle) {
        return (rectangle.getA() + rectangle.getB()) * 2;
    }

}