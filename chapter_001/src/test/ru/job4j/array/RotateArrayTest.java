package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RotateArrayTest {
    RotateArray ra = new RotateArray();

    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 2 на 2.
        int[][] testArray = {{1, 2}, {3, 4}};
        int[][] resultArray = ra.rotate(testArray);
        int[][] expectArray = {{3, 1}, {4, 2}};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 3 на 3.
        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultArray = ra.rotate(testArray);
        int[][] expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenRotateFourRowFourColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 4 на 4.
        int[][] testArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] resultArray = ra.rotate(testArray);
        int[][] expectArray = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        assertThat(resultArray, is(expectArray));
    }
}
