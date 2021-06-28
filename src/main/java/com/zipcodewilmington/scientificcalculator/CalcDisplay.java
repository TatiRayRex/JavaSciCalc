package com.zipcodewilmington.scientificcalculator;

public class CalcDisplay{
//sets calc value to 0
    public double value = 0.00;

    public void setValue(double value) {

        this.value = value;
    }
    public double getValue() {
        return value;
    }

    public void clearDisplay() {
        this.value = 0.00;
    }
    public double showDisplay() {
        return value;
    }

    public double clearError() {
        return this.value = 0.00;
    }


}


