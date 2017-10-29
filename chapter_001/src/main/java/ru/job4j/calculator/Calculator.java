package ru.job4j.calculator;

/**
 * Class Calculate.
 * Тестовое задание выполнение арифметических действий над двумя значениями.
 *
 * @autor alavrinenko.
 * @return double result.
 */
public class Calculator {
    /**
     * Результат вычисления.
     */
    private double result;

    /**
     * Method add.
     * Суммируем два значения.
     *
     * @param first  .
     * @param second .
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtract.
     * Вычитаем из первого второе значение.
     *
     * @param first  .
     * @param second .
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method div.
     * Делим первое значение на второе.
     *
     * @param first  .
     * @param second .
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multip.
     * Умножаем первое значение на второе.
     *
     * @param first  .
     * @param second .
     */
    public void multip(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method getResult.
     * Получаем результат математических действий.
     *
     * @return double result.
     */
    public double getResult() {
        return this.result;
    }
}
