package Figure.calculator.impl;

public interface FigureCalculator<T> {

    double calculateArea(T t);

    double calculatePerimeter(T t);

}