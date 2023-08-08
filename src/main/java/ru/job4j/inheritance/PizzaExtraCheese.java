package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private String portion = " extra cheese";

    public PizzaExtraCheese(String portion) {
        super();
    }

    @Override
    public String name() {
        return super.name() + portion;
    }
}
