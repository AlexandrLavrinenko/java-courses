package ru.job4j.controltask;

/**
 * Class CopyTwoArraysToOne.
 * Дополнительное задание к первой части.
 * Есть два одномерных массива, отсортированных по возрастанию.
 * Создать класс с методом, позволяющим скопировать оба массива в третий.
 * Элементы третьего массива должны быть также отсортированы по возрастанию.
 *
 * @autor alavrinenko.
 */
public class CopyTwoArraysToOne {
    /**
     * Method copyArr.
     * Копирование отсортированных по возрастанию массивов в третий.
     * Элементы принимающего массива также отсортированы по возрастанию.
     *
     * @param arr1 первый массив.
     * @param arr2 второй массив.
     * @return newArr - новый массив, содержащий в себе элементы с первого и второго массивов.
     */
    public int[] copyArr(int[] arr1, int[] arr2) {
        //  создаем новый массив, с длинной равной сумме длин входящих массивов
        int[] newArr = new int[arr1.length + arr2.length];
        // вводим индекс нового массива
        int z = 0, i = 0, j = 0;
        for (; z < newArr.length; z++) {
            if ((i == arr1.length) && (j != arr2.length)) {
                newArr[z] = arr2[j];
                j++;
            } else if ((i != arr1.length) && (j == arr2.length)) {
                newArr[z] = arr1[i];
                i++;
            } else if ((i < arr1.length) && (arr1[i] <= arr2[j])) {
                newArr[z] = arr1[i];
                i++;
            } else if ((j < arr2.length) && (arr1[i] > arr2[j])) {
                newArr[z] = arr2[j];
                j++;
            }
        }
        return newArr;
    }
}
