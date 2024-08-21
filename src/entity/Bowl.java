package org.example.entity;

public class Bowl {
    private int food;

    public void changeFood(int food) {
        if (food < 0 && this.food < Math.abs(food)) {
            System.out.printf("В миске %s еды, а пытаемся съесть %s%n", this.food, food);
        } else {
            this.food += food;
            String message = food < 0 ? "С миски съели " + Math.abs(food) : "В миску добавили " + food;
            System.out.println(message);
        }
    }

    public int getFood() {
        return food;
    }
}