package ru.job4j.oop;

public class Error {

    boolean active;
    int status;
    String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public void printInfo() {
        System.out.println("Активность ошибки: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Текст ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 404,"Компьютер взорвется через 5 секнуд.");
        Error err = new Error();
        error.printInfo();
        err.printInfo();
    }
}
