package org.example.entity;

public class Cat extends Animal {
    private static int number;
    private int maxRunDistance = 200;
    private boolean isSatiety;
    private int needCountFood;

    public Cat(String name) {
        super(name);
        number++;
    }

    public Cat(String name, int needCountFood) {
        super(name);
        this.needCountFood = needCountFood;
        number++;
    }

    public static int getNumber() {
        return number;
    }

    public void eat(Bowl bowl) {
        if (bowl.getFood() < needCountFood) {
            System.out.printf("%s есть не будет, ему мало%n", getName());
        } else {
            System.out.printf("%s ест...%n", getName());
            isSatiety = true;
            bowl.changeFood(-needCountFood);
            System.out.printf("%s поел%n", getName());
        }
    }

    public boolean isSatiety() {
        return isSatiety;
    }

    @Override
    public void sweem(int obstacleLength) {
        System.out.println("Кот плавать не умеет!");
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength > maxRunDistance) {
            System.out.println("Кот пробежал " + maxRunDistance + " из " + obstacleLength + " метров");
        } else {
            System.out.println("Кот пробежал " + obstacleLength + " метров");
        }
    }
}