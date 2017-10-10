package ru.job4j.max;

/**
 * Class Max.
 * Тестовое задание - нахождение максимального значения из двух чисел.
 *
 * @autor alavrinenko.
 * @return double result.
 */
public class Max {
    /**
     * Method max.
     * Находим максимальное значение из двух чисел.
     * @param first .
     * @param second .
     */
    public int max(int first, int second) {
        return (first >= second) ? first : second;
    }
}
