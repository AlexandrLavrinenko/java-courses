package ru.job4j.loop;

/**
 * Class Factorial.
 * Тестовое задание - программа, вычисляющая факториал.
 *
 * @autor alavrinenko.
 * @return double result.
 */
public class Factorial {
    /**
     * Method max.
     * Возвращает рассчитанный факториал для числа n.
     * Если элемент задан отрицательным - возвращает -1.
     * Для нуля - возвращает 1.
     *
     * @param n .
     * @return int result.
     */
    public int calc(int n) {
        int factorial = -1;
        if (n >= 0) {
            switch (n) {
                case 0:
                case 1:
                    factorial = 1;
                break;
                default:
                    factorial = calc(n - 1) * n;
            }
        }
        return factorial;
    }
}
