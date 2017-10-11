package ru.job4j.condition;

/**
 * Class Point.
 * Тестовое задание - нахождение положения точки.
 * Проверка условия - соответствует функции или нет.
 *
 * @autor alavrinenko.
 * @return double result.
 */
public class Point {
    private int x;
    private int y;

    /**
     * Конструктор Point.
     * Задаем координаты точки.
     * @param x .
     * @param y .
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод getX.
     * Получаем координаты X точки.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Метод getY.
     * Получаем координаты Y точки.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Метод is.
     * Проверяем тождество y(x) = a * x + b.
     * @param a .
     * @param b .
     */
    public boolean is(int a, int b) {
        return this.y == a * this.x + b; // используя координаты точки и вычисления функции y(x) = a * x + b
    }
}
