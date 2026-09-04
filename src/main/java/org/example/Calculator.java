package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Add: " + calculator.add(10, 5));
        System.out.println("Sub: " + calculator.sub(10, 5));
    }
}