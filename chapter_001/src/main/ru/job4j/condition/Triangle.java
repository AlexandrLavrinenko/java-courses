package ru.job4j.condition;

/**
 * Class Triangle.
 * Тестовое задание - вычисление площади треугольника по формуле Герона.
 * Проверка условия невозможности построения треугольника через эти точки.
 *
 * @autor alavrinenko.
 * @return double result.
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    /**
     * Конструктор Triangle.
     * Задаем координаты точки.
     * @param a .
     * @param b .
     * @param c .
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод distance вычисляет расстояние между точками left и right.
     *
     * Для вычисления расстояния используем формулу.
     * √(xb - xa)^2 + (yb - ya)^2
     *
     * @param left Точка слева.
     * @param right Точка справа.
     * @return расстояние между точками left и right.
     */
    public double distance(Point left, Point right) {

        return Math.sqrt(Math.pow(right.getX()-left.getX(),2d) + Math.pow(right.getY()-left.getY(), 2d));
    }

    /**
     * Метод period - для вычисления полупериметра по длинам сторон.
     *
     * Формула полупериметра.
     * (ab + ac + bc) / 2 .
     *
     * @param ab расстояние между точками a b .
     * @param ac расстояние между точками a c .
     * @param bc расстояние между точками b c .
     * @return Периметр.
     */
    public double period(double ab, double ac, double bc) {

        return (ab + ac + bc) / 2;
    }

    /**
     * Метод вычисляет площадь треугольника.
     *
     * Формула.
     * √ p *(p - ab) * (p - ac) * (p - bc) .
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            // формула для расчета площади треугольника
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param ab Длина от точки a b.
     * @param ac Длина от точки a c.
     * @param bc Длина от точки b c.
     * @return boolean
     */
    private boolean exist(double ab, double ac, double bc) {
        return ((ab < (ac + bc)) && (ac < (ab + bc)) && (bc < (ab + ac)) ? true : false);
    }
}

