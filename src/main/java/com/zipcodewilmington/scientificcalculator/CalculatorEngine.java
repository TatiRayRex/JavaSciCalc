package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.util.Locale;


public class CalculatorEngine {

    private final CalculatorEngine calculatorEngine = new CalculatorEngine(); // does calculations
    private static final CalcDisplay display = new CalcDisplay();    //displays calculation

    public void run() {
        Console.println("Welcome to our Calculator");
        Console.println("Select option below");
        getInitialInput();

    }

    public void showDisplay(){
        CalculatorEngine.display();
    }

    private static void display() {
    }

    //get input
    public void getInitialInput() {
        String initialSelection = Console.getStringInput("basic, scientific, switch, display");
        switch (initialSelection.toLowerCase(Locale.ROOT)) {
            case "basic":
               basicMath();
                break;


            case "scientific":
               scientificMath();
                break;

            case "switch":
                switchMode();

            case "display":
                showDisplay();
                break;

            case "quit":
                return;


            default:
                break;
        }


    }



    private void switchMode() { }

    private void scientificMath() { }

    private void basicMath() { }


    public String userInput() {

        String userInput = Console.getStringInput("add, subtract, multiply, divide, square, sqRoot, exponent, inverse");
        switch (userInput.toLowerCase()) {

           /*
            public void switchMode() {

            }

            public void switchMode(String "mode"){
            }

            public void doBasicScientific() {

            }

            */

            public void doBasicMath() {

            public static Double getDoubleInput(toString()){
                Scanner scanner = new Scanner(System.in);

                }


                switch (userInput.toLowerCase(Locale.ROOT)) {
                    case "add":
                        calculatorEngine.addNumber(display.getValue(), userInput.isNumber);
                        break;

                        public void addNumber(){
                        double firstValue = Console.getDoubleInput("enter first double");
                        double secondValue  = Console.getDoubleInput("enter second double");
                        Double newValue = add(firstValue, secondValue);
                        display.setValue(Double.parseDouble(newValue.toString()));
                    }

                    case "subtract":
                        subtractNumber(display.getValue(), userInput.isNumber);
                        break;

                        public void subtractNumber(){
                        double firstValue = Console.getDoubleInput("enter first double");
                        double secondValue  = Console.getDoubleInput("enter second double");
                        Double newValue = calculatorEngine.subtract(firstValue, secondValue);
                        display.setValue(Double.parseDouble(newValue.toString()));

                    }



                    case "multiply":
                        calculatorEngine.multiplyNumber(display.getValue(), userInput.isNumber);
                        break;

                        public void multiplyNumber(){
                        double firstValue = Console.getDoubleInput("enter first double");
                        double secondValue  = Console.getDoubleInput("enter second double");
                        Double newValue = multiply(firstValue, secondValue);
                        display.setValue(Double.parseDouble(newValue.toString()));
                    }

                    case "divide":
                        calculatorEngine.divideNumber(display.getValue(), userInput.isNumber);
                        break;

                        public void divideNumber(){
                        double firstValue = Console.getDoubleInput("enter first double");
                        double secondValue  = Console.getDoubleInput("enter second double");
                        Double newValue = calculatorEngine.divide(firstValue, secondValue);
                        display.setValue(Double.parseDouble(newValue.toString()));
                        }

                    }

                    case "square":
                        square(user.isNumber);
                        break;

                        public void squareNumber(){
                        double firstValue = Console.getDoubleInput("enter first double");
                        double secondValue  = Console.getDoubleInput("enter second double");
                        Double newValue = square(firstValue, secondValue);
                        display.setValue(Double.parseDouble(newValue.toString()));
                }


                    case "sqRoot:
                        squareRoot(user.isNumber);
                        break;



                        public void squareRoot() {
                        double firstValue = Console.getDoubleInput("enter first double");
                        double secondValue = Console.getDoubleInput("enter second double");
                        Double newValue = squareRoot(firstValue);
                        display.setValue(Double.parseDouble(newValue.toString()));
                        }


                    case "exponent":
                        exponent(display.getValue(), user.isNumber);
                        break;

                        public void exponent() {
                        double firstValue = Console.getDoubleInput("enter first double");
                        double secondValue = Console.getDoubleInput("enter second double");
                        Double newValue = exponent(firstValue, secondValue);
                        display.setValue(Double.parseDouble(newValue.toString()));

                        }





            } }

        }

        public static double add(double firstValue, double secondValue) {

            return firstValue + secondValue;
        }

        public static double subtractNumber(double firstValue, double secondValue) {
            return firstValue - secondValue;
        }

        public double divide(double firstValue, double value2) {
            if(value2 == 0) { (Console.println("Error");)
            }
            return firstValue / value2;
        }

        public static double multiply(double firstValue, double value2) {git
            return firstValue * value2;
        }

        public static double square(double firstValue) {
            return firstValue * firstValue;
        }

        public static double squareRoot(double firstValue) {

            return Math.sqrt(firstValue);
        }

        public static double exponent(double firstValue, double secondValue) {
            return Math.pow(firstValue, secondValue);
        }





}

