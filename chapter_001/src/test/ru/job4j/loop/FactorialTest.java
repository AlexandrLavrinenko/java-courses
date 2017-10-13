package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FactorialTest {
    Factorial factor = new Factorial();
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int result = factor.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int result = factor.calc(0);
        assertThat(result, is(1));
    }

    @Test
    public void whenCalculateFactorialForNegativeNumberThenNegatieOne() {
        //напишите здесь тест, проверяющий, что факториал для отрицательного числа 0 возвращает -1.
        int result = factor.calc(-7);
        assertThat(result, is(-1));
    }
}