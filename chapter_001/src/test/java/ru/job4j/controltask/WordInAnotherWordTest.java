package ru.job4j.controltask;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class WordInAnotherWordTest {
    @Test
    public void whenOriginArrayContainSubArrayThreeSymbols() {
        WordInAnotherWord ww = new WordInAnotherWord();
        boolean result = ww.contains("Lenovo", "ovo");
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenOriginArrayNotContainSubArrayFiveSymbols() {
        WordInAnotherWord ww = new WordInAnotherWord();
        boolean result = ww.contains("Siemens", "girls");
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenOriginArrayContainSubArrayFourSymbols() {
        WordInAnotherWord ww = new WordInAnotherWord();
        boolean result = ww.contains("Siemens", "mens");
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenOriginArrayContainSubArrayTwoSymbolsInMiddle() {
        WordInAnotherWord ww = new WordInAnotherWord();
        boolean result = ww.contains("Samsumg", "am");
        boolean expected = true;
        assertThat(result, is(expected));
    }
}