package org.example.entity;

public abstract class Animal {
    private static int number;
    private String name;

    public Animal(String name) {
        this .name = name;
        number++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getNumber(){
        return number;
    }

    public abstract void sweem(int obstacleLength);

    public abstract void run(int obstacleLength);
}