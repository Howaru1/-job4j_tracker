package ru.job4j.oop;

public class Max {

    public static int max(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : (( b > c) ? b : c);
    }

    public static int max(int a, int b, int c, int d) {
        return (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d)) :
                ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));
    }
}
