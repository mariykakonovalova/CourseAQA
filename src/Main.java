package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Колбаса", "Хлеб", "Яйца", "Хлеб", "Сыр", "Мороженное", "Молоко", "Кефир", "Хлеб", "Сыр"};
        displayUnique(array);
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Коновалова", "375336511702");
        telephoneDirectory.add("Коновалова", "375336511702");
        telephoneDirectory.add("Иванов", "375445367253");
        telephoneDirectory.add("Петров", "375331167253");
        System.out.println(telephoneDirectory);
    }

    private static void displayUnique(String[] array) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer amount = map.get(array[i]);
            if (amount == null) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], amount + 1);
            }
        }
        System.out.println(map);
    }

}