package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PointTest {

    @Test
    public void whenFirst03AndSecond23() {
        Point a = new Point(0,3);
        Point b = new Point(2,3);
        double distance = a.distance(b);
        double expected = 2.0;
        assertThat(distance).isEqualTo(expected);
    }

    @Test
    public void whenFirst04AndSecond03() {
        Point a = new Point(0,4);
        Point b = new Point(0,3);
        double distance = a.distance(b);
        double expected = 1.0;
        assertThat(distance).isEqualTo(expected);
    }
}