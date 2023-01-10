package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            spacePrint(cathetusLength - i - 1);
            printNumberInReverseOrder(i);
            System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

    private void spacePrint(int count) {
        for (int i = 0; i <= count; i++) {
            System.out.print(" ");
        }
    }

    private void printNumberInReverseOrder(int number) {
        for (int i = number; i > 1; i--) {
            System.out.print("*");
        }
    }

}
