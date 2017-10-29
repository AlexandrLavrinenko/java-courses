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
     * @param h - ширина доски.
     * @return String result.
     */
    public String piramid(int h) {
        StringBuilder builder = new StringBuilder();
        // минимальное количество символов в пирамиде
        int minSymbols = 1;
        int pSpace = h - 1;

        for (int i = 0; i < h; i++) {
            for (int j = pSpace; j > i; j--) {
                builder.append(" ");
            }
            for (int k = 0; k < minSymbols; k++) {
                builder.append("^");
            }
            minSymbols += 2;
            if (i < h - 1) {
                builder.append(System.getProperty("line.separator"));
            }
        }
        return builder.toString();
    }
}
