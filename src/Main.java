package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateFactorial(0));
    }

    public static int calculateFactorial(int n){
        if(n<0){
            throw new RuntimeException(String.format("Нельзя подсчитать факториал отрицательного числа %s", n));
        }
        if (n==0){
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}