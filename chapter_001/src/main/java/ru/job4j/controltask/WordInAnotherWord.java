package ru.job4j.controltask;

import java.util.Arrays;

/**
 * Class WordInAnotherWord.
 * Контрольное задание к первой части.
 * Проверка, что одно слово находится в другом слове (с преобразованием строки в массив символов).
 *
 * @autor alavrinenko.
 * @return Boolean value.
 */
public class WordInAnotherWord {
    /**
     * Method contains.
     * Поиск строки в подстроке.
     *
     * @param origin исходная строка.
     * @param sub строка поиска.
     * @return boolean - входит или нет искомая строка в исходную.
     */
    boolean contains(String origin, String sub) {
        boolean result = false;
        // преобразуем входящие параметры в массив символов
        char[] chOrigin = origin.toCharArray();
        char[] chSub = sub.toCharArray();

        // ищем вхождения одного массива символов в другой
        for (int startIndex = 0; startIndex < chOrigin.length - chSub.length + 1; startIndex++) {
            int endIndex = startIndex + chSub.length;
            char[] chArr = Arrays.copyOfRange(chOrigin, startIndex, endIndex);
            result = Arrays.equals(chArr, chSub);
            if (result) {
                return result;
            }
        }
        return result;
    }
}
