package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Factorial;
//import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;

public class SciCalcTest { //first brace

        @Test
        public void testSin () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 0;
        double expectedValue = 0;

        //When
        double actualValue = calculator.Sin(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends sine

        @Test
        public void testCos () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 0;
        double expectedValue = 1;

        //When
        double actualValue = calculator.Cos(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends cosine

        @Test
        public void testTan () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 0;
        double expectedValue = 0;

        //When
        double actualValue = calculator.Tan(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends tangent

        @Test
        public void testArcSin () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = .8660254038;
        double expectedValue = 1.0471975512277205;

        //When
        double actualValue = calculator.ArcSin(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends inverse sine

        @Test
        public void testArcCos () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = .5;
        double expectedValue = 1.047197551;

        //When
        double actualValue = calculator.ArcCos(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends inverse cosine

        @Test
        public void testArcTan () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 1;
        double expectedValue = .7853981634;

        //When
        double actualValue = calculator.ArcTan(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends tangent

        //I have to come back to all trig functions and figure out a way to make them also calculate in Degrees


        @Test
        public void testLogarithm () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 100;
        double expectedValue = 2;

        //When
        double actualValue = calculator.Logarithm(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends logarithm

        @Test
        public void testInverseLog () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 3;
        double expectedValue = 1000;

        //When
        double actualValue = calculator.InverseLog(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends exponential form of a logarithm (inverse log)

        @Test
        public void testNaturalLog () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 2;
        double expectedValue = .6931471806;

        //When
        double actualValue = calculator.NaturalLog(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }   // ends ln test

        @Test
        public void testInverseLn () {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 2.197224577;
        double expectedValue = 9;

        //When
        double actualValue = calculator.InverseLn(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue, .001);
        System.out.println(expectedValue);
    }   // ends exponential (euler's-inverse natural log)

    // start code to try out degrees

    // end code to try out degrees

    @Test
    public void testFactorial() {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 3;
        double expectedValue = 6;

        //When
        double actualValue = Factorial.factorial(num1);

        //Then
        Assert.assertEquals(expectedValue, actualValue,.001);
        System.out.println(expectedValue);
    }   // ends factorial

} //final brace

