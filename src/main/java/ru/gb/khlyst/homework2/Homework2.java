package ru.gb.khlyst.homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(Task1(6, 5));
        Task2();
    }

    public static boolean Task1(int a, int b) {
        return a + b <= 20 && a + b >= 10;
    }

    public static void Task2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print a");
        int a = scanner.nextInt();
        if (a >= 0){
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }
}
