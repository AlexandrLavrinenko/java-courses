package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    Max maximum = new Max();
    @Test
    public void whenFirstMoreSecond() {
        int result = maximum.max(10, 5);
        assertThat(result, is(10));
    }

    @Test
    public void whenFirstLessSecond() {
        int result = maximum.max(3, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMoreFirstAndThird() {
        int result = maximum.maxThird(5, 7, 2);
        assertThat(result, is(7));
    }
}