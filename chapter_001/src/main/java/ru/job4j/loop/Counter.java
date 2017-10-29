package ru.job4j.loop;

/**
 * Class Counter.
 * Тестовое задание - подсчет суммы чётных чисел в диапазоне.
 *
 * @autor alavrinenko.
 * @return double result.
 */
public class Counter {
    /**
     * Method max.
     * Выполняем подсчет суммы чётных чисел в диапазоне.
     *
     * @param start  - начальная позиция.
     * @param finish - конечная позиция.
     * @return int result.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
