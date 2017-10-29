package ru.job4j.array;

/**
 * Class Turn.
 * Тестовое задание перевернуть массив.
 *
 * @autor alavrinenko.
 * @return array result.
 */
public class Turn {
    /**
     * Method back.
     * Переворачиваем массив в обратном направлении.
     *
     * @param array исходный массив.
     * @return array перевернутый массив.
     */
    public int[] back(int[] array) {
        // середина массива
        int mediana;
        // переменная для сохранения промежуточного результата
        int temp;
        // индексы для замены
        int indexUp, indexDown;
        // определяем ветку (четное / нечетное количество элементов в массиве)
        if (array.length % 2 == 0) {   // четное количество элементов
            mediana = array.length / 2 - 1;
            for (int i = 0; i <= mediana; i++) {
                indexDown = mediana - i;
                indexUp = mediana + i + 1;
                temp = array[indexDown];
                array[indexDown] = array[indexUp];
                array[indexUp] = temp;
            }
        } else {                    // нечетное количество элементов
            mediana = (int) Math.ceil((double) array.length / 2) - 1;
            for (int i = 1; i <= mediana; i++) {
                indexDown = mediana - i;
                indexUp = mediana + i;
                temp = array[indexDown];
                array[indexDown] = array[indexUp];
                array[indexUp] = temp;
            }
        }
        return array;
    }
}
