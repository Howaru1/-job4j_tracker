package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    public void whenException() {
        Factorial fact = new Factorial();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    fact.calc(-1);

                });
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }

    @Test
    public void when3To6() {
        Factorial fact = new Factorial();
        int rsl = fact.calc(3);
        assertEquals(rsl, 6);
    }
}