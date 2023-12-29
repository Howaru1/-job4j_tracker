package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Движение вперед");
    }

    @Override
    public void pas(int passengers) {
        System.out.println(passengers + " пассажиров");

    }

    @Override
    public double refuel(double price) {
        return price * 80.45;
    }
}
