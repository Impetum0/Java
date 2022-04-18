package ru.gb.khlyst.homework1;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void checkSumSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print a");
        int a = scanner.nextInt();
        System.out.println("Print b");
        int b = scanner.nextInt();
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите показатель");
        int value = scanner.nextInt();
        if (value <= 0){
            System.out.println("Красный");
        }
        if ( value > 0 && value <= 100 ){
            System.out.println("Желтый");
        }
        if (value > 100){
            System.out.println("Зеленый");
        }
    }
}

