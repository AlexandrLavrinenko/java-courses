package ru.job4j.array;

import org.junit.Test;

import ru.job4j.array.ArrayDuplicate;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.core.Is.is;


public class ArrayDuplicateTest {
    ArrayDuplicate arrayDuplicate = new ArrayDuplicate();

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        String[] arrSt = {"1", "2", "2", "3", "1", "4", "1"};
        String[] result = arrayDuplicate.remove(arrSt);
        String[] except = {"4", "1", "2", "3"};
        assertThat(result, arrayContainingInAnyOrder(except));
//        assertThat(result, is(except));
    }

    @Test
    public void whenRemoveAllDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        String[] arrSt = {"1", "1", "1", "1", "1"};
        String[] result = arrayDuplicate.remove(arrSt);
        String[] except = {"1"};
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesInOtherArrayThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        String[] arrSt = {"1", "2", "2", "1", "4", "6"};
        String[] result = arrayDuplicate.remove(arrSt);
        String[] except = {"6", "4", "2", "1"};
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}