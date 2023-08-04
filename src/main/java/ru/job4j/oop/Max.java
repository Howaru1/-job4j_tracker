package ru.job4j.oop;

public class Max {

    public static int max(int a, int b, int c) {
        int result = a;
        if (b >= c && b >= a) {
            result = b;
        } else {
            result = c;
        }
        return result;
    }

    public static int max(int a, int b, int c, int d) {
        int result = a;
        if (b >= c && b >= a && b >= d) {
            result = b;
        } else if (c >= a && c >= b && c >= d) {
            result = c;
        } else {
            result = d;
        }
        return result;
    }
}
