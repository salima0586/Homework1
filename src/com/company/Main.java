package com.company;

public class Main {

    public static void main(String[] args) {
        String first_kompany;
        final int NUM = 25;
        String word = "Word";
        first_kompany = NUM + "" + word;

        System.out.println("Первая переменная:" + first_kompany +
                "Вторая переменная:" + NUM + "Третья переменная:" + word);

        if (NUM > 0) {
            System.out.println("Вы сохранили отрицательное число");

        } else if (NUM < 0) {
            System.out.println("ВЫ сохранили положительное число");

        } else if (NUM == 0) {
            System.out.println("Вы сохранили ноль");
        } else {
            System.out.println("Вы сохранили ноль");
        }
    }
}
