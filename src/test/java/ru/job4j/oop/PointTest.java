package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class PointTest {

    @Test
    public void whenFirst03AndSecond23() {
        Point a = new Point(0, 3);
        Point b = new Point(2, 3);
        double distance = a.distance(b);
        double expected = 2.0;
        assertThat(distance).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void whenFirst04AndSecond03() {
        Point a = new Point(5, 4);
        Point b = new Point(4, 3);
        double distance = a.distance(b);
        double expected = 1.414;
        assertThat(distance).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void whenFirst123ToSecond456AndThird123() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        Point c = new Point(1, 2, 3);
        double distanceAB = a.distance3d(b);
        double expectedAB = 5.196;
        assertThat(distanceAB).isCloseTo(expectedAB, offset(0.001));

        double distanceAC = a.distance3d(c);
        double expectedAC = 0.0;
        assertThat(distanceAC).isEqualTo(expectedAC, offset(0.001));

        double distanceBC = b.distance3d(c);
        double expectedBC = 5.196;
        assertThat(distanceBC).isCloseTo(expectedBC, offset(0.001));
    }

    @Test
    public void whenFirst001ToSecond334AndThird555() {
        Point a = new Point(1, 2, 1);
        Point b = new Point(3, 2, 4);
        Point c = new Point(5, 7, 1);
        double distanceAB = a.distance3d(b);
        double expectedAB = 3.605;
        assertThat(distanceAB).isCloseTo(expectedAB, offset(0.001));

        double distanceAC = a.distance3d(c);
        double expectedAC = 6.403;
        assertThat(distanceAC).isEqualTo(expectedAC,offset(0.001));

        double distanceBC = b.distance3d(c);
        double expectedBC = 6.164;
        assertThat(distanceBC).isCloseTo(expectedBC, offset(0.001));
    }
}