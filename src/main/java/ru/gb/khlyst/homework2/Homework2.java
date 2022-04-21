package ru.gb.khlyst.homework2;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(Task1(6, 5));
    }

    public static boolean Task1(int a, int b) {
        return a + b <= 20 && a + b >= 10;
    }
}
