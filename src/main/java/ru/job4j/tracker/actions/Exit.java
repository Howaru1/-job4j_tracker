package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Output;
import ru.job4j.tracker.Tracker;

public class Exit implements UserAction {
    private final Output out;

    public Exit(Output output) {
        this.out = output;
    }

    @Override
    public String name() {
        return "Завершить программу";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Завершение программы ===");
        return false;
    }
}
