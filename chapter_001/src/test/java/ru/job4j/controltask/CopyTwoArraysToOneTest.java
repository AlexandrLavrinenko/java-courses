package ru.job4j.controltask;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CopyTwoArraysToOneTest {
    CopyTwoArraysToOne arraysToOne = new CopyTwoArraysToOne();

    @Test
    public void whenCopyToNewArrTenNumThenMakeElementsByRange() {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 8, 12, 16};
        int[] result = arraysToOne.copyArr(arr1, arr2);
        int[] except = {1, 2, 3, 4, 5, 7, 8, 9, 12, 16};
        assertThat(result, is(except));
    }

    @Test
    public void whenCopyToNewArrTwelveNumThenMakeElementsByRange() {
        int[] arr1 = {1, 5, 7, 20, 21};
        int[] arr2 = {0, 6, 8, 12, 16, 40, 44};
        int[] result = arraysToOne.copyArr(arr1, arr2);
        int[] except = {0, 1, 5, 6, 7, 8, 12, 16, 20, 21, 40, 44};
        assertThat(result, is(except));
    }

    @Test
    public void whenCopyToNewArrNineNumWithEqualElementsThenMakeElementsByRange() {
        int[] arr1 = {0, 1, 1, 7, 21};
        int[] arr2 = {0, 3, 7, 7};
        int[] result = arraysToOne.copyArr(arr1, arr2);
        int[] except = {0, 0, 1, 1, 3, 7, 7, 7, 21};
        assertThat(result, is(except));
    }
}