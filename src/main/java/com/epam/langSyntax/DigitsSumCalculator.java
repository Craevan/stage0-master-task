package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int lastDigit = number % 10;
        int middleDigit1 = (number / 10) % 10;
        int middleDigit2 = (number / 100) % 10;
        int firstDigit = number / 1000;
        printSum(firstDigit, middleDigit1, middleDigit2, lastDigit);
    }

    private void printSum(int x, int y, int z, int w) {
        System.out.println(x + y + z + w);
    }

}
