package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            spacePrint(cathetusLength - i - 1);
            printNumberInReverseOrder(i);
            System.out.print(1);
            printNumberInNaturalOrder(i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

    private void spacePrint(int count) {
        for (int i = 0; i <= count; i++) {
            System.out.print(" ");
        }
    }

    private void printNumberInNaturalOrder(int number) {
        for (int i = 1; i < number; i++) {
            System.out.print(i + 1);
        }
    }

    private void printNumberInReverseOrder(int number) {
        for (int i = number; i > 1; i--) {
            System.out.print(i);
        }
    }

}
