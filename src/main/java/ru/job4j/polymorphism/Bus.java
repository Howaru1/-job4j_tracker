package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public int pas() {
        return 0;
    }

    @Override
    public double refuel(double price) {
        double fuel = 80.4;
        double rate = 55.75;
        return fuel * rate;
    }
}
