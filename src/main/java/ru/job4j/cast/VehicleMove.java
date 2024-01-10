package ru.job4j.cast;

public class VehicleMove {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{bus, train, plane};
        for (Vehicle object : vehicles) {
            object.move();
        }
    }
}
