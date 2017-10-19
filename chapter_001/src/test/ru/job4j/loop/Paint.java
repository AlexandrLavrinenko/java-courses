package ru.job4j.loop;

/**
 * Class Paint.
 * Тестовое задание - построить пирамиду в псевдографике.
 *
 * @autor alavrinenko.
 * @return String result.
 */
public class Paint {
    /**
     * Method piramid.
     * Рисует пирамиду заданной высоты из символов ^ и пробелов.
     * Для сложения строк используем класс StringBuilder - и методы append(String), String toString()
     *
     * @param h  - ширина доски.
     * @return String result.
     */
    public String piramid(int h) {
        StringBuilder builder = new StringBuilder();
        // минимальное количество символов в пирамиде
        int min_symbols = 1;
        int p_space = h - 1;

        for (int i = 0; i < h; i++) {
            for (int j = p_space; j > i; j--) {
                builder.append(" ");
            }
            for (int k = 0; k < min_symbols; k++) {
                builder.append("^");
            }
            min_symbols+=2;
            if(i < h-1) {
                builder.append(System.getProperty("line.separator"));
            }
        }
        return builder.toString();
    }
}
