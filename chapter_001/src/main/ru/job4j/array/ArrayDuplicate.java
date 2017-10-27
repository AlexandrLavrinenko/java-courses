package ru.job4j.array;

import java.util.Arrays;

/**
 * Class ArrayDuplicate.
 * Тестовое задание - удаление дубликатов в массиве.
 *
 * @autor alavrinenko.
 * @return array result.
 */
public class ArrayDuplicate {
    /**
     * Method remove.
     * Удаление дубликатов в массиве.
     *
     * @param array - исходный массив.
     * @return array - массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int duplicates = 0;
        for (int out = 0; out < array.length-duplicates; out++) {
            for (int in = out + 1; in < array.length-duplicates; in++) {
                if (array[out].equals(array[in])) {
                    String temp = array[out];
                    array[out] = array[array.length - 1 - duplicates];
                    array[array.length - 1 - duplicates] = temp;
                    duplicates++;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, array.length - duplicates);
    }
}
