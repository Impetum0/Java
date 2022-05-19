package ru.gb.khlyst.homework1;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
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
            System.out.println("positive");}
        else {
            System.out.println("negative");
        }
    }

    public static void printColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print value");
        int value = scanner.nextInt();
        if (value <= 0){
            System.out.println("Red");
        }
        if ( value > 0 && value <= 100 ){
            System.out.println("Yellow");
        }
        if (value > 100){
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print a");
        int a = scanner.nextInt();
        System.out.println("Prinnt b");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}

