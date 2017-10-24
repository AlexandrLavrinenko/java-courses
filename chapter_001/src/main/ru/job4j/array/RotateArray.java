package ru.job4j.array;

/**
 * Class RotateArray.
 * Тестовое задание - сортировка массива пузырьком.
 *
 * @autor alavrinenko.
 * @return array result.
 */
public class RotateArray {
    /**
     * Method rotate.
     * Поворачиваем двумерный массив по часовой стрелке.
     *
     * @param array - исходный массив.
     * @return array - развернутый массив.
     */
    public int[][] rotate(int[][] array) {

        // находим длинну и ширину массива
        int col = array.length;
        int row = array[0].length;
        // поворот вправо
        for (int i = 0; i < col/2; i++) {
            for (int j = i; j < row-1-i; j++) {

                int tmp                 = array[i][j];
                array[i][j]             = array[row-j-1][i];
                array[row-j-1][i]       = array[col-i-1][row-j-1];
                array[col-i-1][row-j-1] = array[j][col-i-1];
                array[j][col-i-1]       = tmp;
            }
        }
        return array;
    }
}