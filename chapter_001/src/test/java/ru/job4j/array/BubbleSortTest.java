package ru.job4j.array;

import org.junit.Test;

import ru.job4j.array.BubbleSort;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BubbleSortTest {
    BubbleSort bs = new BubbleSort();
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        int[] testArray   = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] resultArray = bs.sort(testArray);
        int[] expectArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenSortArrayWithFiveElementsThenSortedArray() {
        int[] testArray   = {5, 1, 2, 7, 3};
        int[] resultArray = bs.sort(testArray);
        int[] expectArray = {1, 2, 3, 5, 7};
        assertThat(resultArray, is(expectArray));
    }

}