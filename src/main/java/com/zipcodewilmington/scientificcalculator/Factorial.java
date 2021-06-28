package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class Factorial {
    public static double factorial(double input) {
        double factorialFunction = 1.0;
        int i;
        for (i = 2; i <= input; i++) {
            factorialFunction += factorialFunction * (i - 1);
        }
        return factorialFunction;
    }

}

















