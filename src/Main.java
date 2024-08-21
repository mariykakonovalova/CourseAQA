package org.example;

import org.example.entity.Animal;
import org.example.entity.Bowl;
import org.example.entity.Cat;
import org.example.entity.Dog;
import org.example.Figure.Circle;
import org.example.Figure.Rectangle;
import org.example.Figure.Triangle;
import org.example.Figure.calculator.impl.CircleCalculator;
import org.example.Figure.calculator.impl.RectangleCalculator;
import org.example.Figure.calculator.impl.TriangleCalculator;

public class Main {
    public static void main(String[] args) {
        task11();
        task12();
        task2();
    }

    private static void task11() {
        Cat cat1 = new Cat("Musya");
        Cat cat2 = new Cat("Anfisa");
        Dog dog1 = new Dog("Rex");

        System.out.println("Количество животных " + Animal.getNumber());

        cat1.run(300);
        dog1.run(600);
        cat2.sweem(2);
        dog1.sweem(15);
    }

    private static void task12() {
        Cat[] cats = {
                new Cat("Pushistic", 1),
                new Cat("Snezhok", 20),
                new Cat("Barsik", 40)};
        Bowl bowl = new Bowl();
        bowl.changeFood(30);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl);
            System.out.printf("В миске осталось %s%n", bowl.getFood());
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.printf("%s %s%n", cats[i].getName(), cats[i].isSatiety() ? "сытый" : "не сытый");
        }
    }

    private static void task2() {
        Circle circle = new Circle(5, "Green", "Black");
        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println("Площадь круга: " + circleCalculator.calculateArea(circle));
        System.out.println("Периметр круга: " + circleCalculator.calculatePerimeter(circle));
        System.out.println("Цвет заливки " + circle.getFillColor() + " Цвет границы " + circle.getBorderColor());

        Rectangle rectangle = new Rectangle(3.2, 4.4, "Pink", "Red");
        RectangleCalculator rectangleCalculator = new RectangleCalculator();
        System.out.println("Площадь окружности " + rectangleCalculator.calculateArea(rectangle));
        System.out.println("Периметр окружности " + rectangleCalculator.calculatePerimeter(rectangle));
        System.out.println("Цвет заливки " + rectangle.getFillColor() + " Цвет границы " + rectangle.getBorderColor());

        Triangle triangle = new Triangle(2, 3.2, 1.5, "Yellow", "Blue");
        TriangleCalculator triangleCalculator = new TriangleCalculator();
        System.out.println("Площадь окружности " + triangleCalculator.calculateArea(triangle));
        System.out.println("Периметр окружности " + triangleCalculator.calculatePerimeter(triangle));
        System.out.println("Цвет заливки " + triangle.getFillColor() + " Цвет границы " + triangle.getBorderColor());
    }

}
