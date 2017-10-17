package ru.job4j.loop;

/**
 * Class Factorial.
 * Тестовое задание - построить шахматную доску в псевдографике.
 *
 * @autor alavrinenko.
 * @return double result.
 */
public class Board {
    /**
     * Method paint.
     * Рисует шахматную доску из символов x и пробелов.
     * Если элемент задан отрицательным - возвращает -1.
     * Для нуля - возвращает 1.
     * Для сложения строк используем класс StringBuilder - и методы append(String), String toString()
     *
     * @param width  - ширина доски.
     * @param height - высота доски.
     * @return String result.
     */
    public String paint(int width, int height) {
        StringBuilder builder = new StringBuilder();
        // проверяем на четность строку
        for (int j = 1; j <= height; j++) {
            if (j % 2 == 0) {
                // заполняем четную строку
                for (int i = 1; i <= width; i++) {
                    // нечетные строки начинаем с x, четные - с пробела
                    if (i % 2 == 0) {
                        builder.append("x"); // добавляем "x"
                    } else {
                        builder.append(" "); // добавляем пробел
                    }
                } builder.append(System.getProperty("line.separator"));
            } else {
                // заполняем нечетную строку
                for (int i = 1; i <= width; i++) {
                    // нечетные строки начинаем с x, четные - с пробела
                    if (i % 2 == 0) {
                        builder.append(" "); // добавляем пробел
                    } else {
                        builder.append("x"); // добавляем "x"
                    }
                } builder.append(System.getProperty("line.separator"));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.paint(5, 4));
    }
}
