package com.epam.OOP;

public class Animal {

    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return "This animal is mostly " + color + ". "
                + "It has " + numberOfPaws
                + (numberOfPaws > 1 ? " paws" : " paw")
                + " and "
                + (hasFur ? "a fur." : "no fur.");
    }
}
