package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenPointExistLineThenTrue() {
        //create of new point.
        Point a = new Point(2, 10);
        // execute method - is and get result;
        boolean rsl = a.is(3, 4);
        // assert result by excepted value.
        assertThat(rsl, is(true));
    }

    @Test
    public void whenPointNotExistLineThenFalse() {
        //create of new point.
        Point a = new Point(7, 15);
        // execute method - is and get result;
        boolean rsl = a.is(2, 2);
        // assert result by excepted value.
        assertThat(rsl, is(false));
    }
}