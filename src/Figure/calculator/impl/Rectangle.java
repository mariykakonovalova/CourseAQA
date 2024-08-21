package org.example.Figure;

public class Rectangle {
    private double a;
    private double b;
    private String fillColor;
    private String borderColor;

    public Rectangle(double a, double b, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

}