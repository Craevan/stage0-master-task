package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int lastNumber = number % 10;
        int middleNumber = (number / 10) % 10;
        int firstNumber = number / 100;
        printNumber(lastNumber, middleNumber, firstNumber);
    }

    private void printNumber(int x, int y, int z) {
        System.out.printf("%d%d%d\n", x, y, z);
    }

}
