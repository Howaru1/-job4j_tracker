package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int m) {
        return m - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int s) {
        return sum(s) + minus(s) + divide(s) + multiply(s);
    }

    public static void main(String[] args) {
        int result = sum(10);
        int rslMinus = minus(2);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(3);
        int rslDivide = calculator.divide(2);
        int rslSum = calculator.sumAllOperation(4);
        System.out.println(result);
        System.out.println(rslMinus);
        System.out.println(rsl);
        System.out.println(rslDivide);
        System.out.println(rslSum);
    }
}
