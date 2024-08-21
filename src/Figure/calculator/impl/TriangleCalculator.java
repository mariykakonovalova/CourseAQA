package Figure.calculator.impl;


import org.example.Figure.calculator.FigureCalculator;
import org.example.Figure.Triangle;

public class TriangleCalculator implements FigureCalculator<Triangle> {

    @Override
    public double calculateArea(Triangle triangle) {
        double p = (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
        return Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));
    }

    @Override
    public double calculatePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

}