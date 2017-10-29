package ru.job4j;

/**
 * Class Calculate.
 * Тестовое задание - вывод на консоль фразы "Hello, world".
 *
 * @autor alavrinenko.
 * @return String value.
 */
public class Calculate {
    /**
     * Main method.
     * Главный метод для вывода текстовой строки в консоль.
     *
     * @param arg строка для вывода в консоль (str).
     * @return String value.
     */
    public static void main(String[] arg) {
        String str = "Hello, world";
        System.out.println(str);
    }

    /**
     * Method echo.
     *
     * @param name Your name.
     * @return Echo plus your name.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}