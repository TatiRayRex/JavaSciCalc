package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.util.Locale;

public class Calculator {
    private  CalculatorEngine calculatorEngine = new CalculatorEngine();

    double memory = 0;

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void clearMemory() {
        this.memory = 0;
    }


}

