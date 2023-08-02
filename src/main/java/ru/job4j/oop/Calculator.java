package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int m) {
        return x - m;
    }

    public int divide( int d) {
        return x / d;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int s) {
        Calculator calculator = new Calculator();
        int sumResult = sum(s);
        int minusResult = minus(s);
        int divideResult = divide(s);
        int multiplyResult = multiply(s);
        return sumResult + minusResult + divideResult + multiplyResult;
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
