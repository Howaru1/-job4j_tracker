package ru.job4j.tracker;

import ru.job4j.tracker.ConsoleInput;

public class ValidateInput implements Input {
    private final Output out;
    private final Input input;

    public ValidateInput(Output output, Input input) {
        this.out = output;
        this.input = input;
    }

    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = input.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                out.println("Пожалуйста, введите корректные данные");
            }
        } while (invalid);
        return value;
    }
}