package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax2To1Then2() {
        int a = 2;
        int b = 1;
        int result = Max.max(a, b);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

        @Test
        public void whenMax5To5Then5() {
            int a = 5;
            int b = 5;
            int result = Max.max(a, b);
            int expected = 5;
            assertThat(result).isEqualTo(expected);
        }

    @Test
    public void whenMax2To12To3Then12() {
        int a = 2;
        int b = 12;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To5To5Then5() {
        int a = 3;
        int b = 5;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To4To7Then7() {
        int a = 1;
        int b = 2;
        int c = 4;
        int d = 7;
        int result = Max.max(a, b, c, d);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To5To5To2Then5() {
        int a = 4;
        int b = 5;
        int c = 5;
        int d = 2;
        int result = Max.max(a, b, c, d);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}