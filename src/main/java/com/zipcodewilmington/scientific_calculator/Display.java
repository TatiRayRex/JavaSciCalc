package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;

public class Display {

    public void displayError() {
        Console.println("Error, not valid");
    }

    public String getValue() {
        return this.value;
    }
}
