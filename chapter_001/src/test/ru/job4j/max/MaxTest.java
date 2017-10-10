package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstMoreSecond() {
        Max maximum = new Max();
        int result = maximum.max(10, 5);
        assertThat(result, is(10));
    }

    @Test
    public void whenFirstLessSecond() {
        Max maximum = new Max();
        int result = maximum.max(3, 5);
        assertThat(result, is(5));
    }
}