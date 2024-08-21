package org.example.Figure;

import org.example.Figure.calculator.FigureCalculator;
import org.example.Figure.Circle;

public class CircleCalculator implements FigureCalculator<Circle> {

    @Override
    public double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(),2);
    }

    @Override
    public double calculatePerimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

}