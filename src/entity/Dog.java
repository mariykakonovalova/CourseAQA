package org.example.entity;

public class Dog extends Animal {
    private static int number;
    private int maxRunDistance = 500;
    private int maxSweemDistance = 10;

    public Dog(String name) {
        super(name);
        number++;
    }

    public static int getNumber(){
        return number;
    }

    @Override
    public void sweem(int obstacleLength) {
        if (obstacleLength > maxSweemDistance) {
            System.out.println("Собака проплыла " + maxSweemDistance + " из " + obstacleLength + " метров");
        } else {
            System.out.println("Собака проплыла " + obstacleLength + " метров");
        }
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength > maxRunDistance) {
            System.out.println("Собака пробежала " + maxRunDistance + " из " + obstacleLength + " метров");
        } else {
            System.out.println("Собака пробежала " + obstacleLength + " метров");
        }
    }
}