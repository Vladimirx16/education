package com.Vladimir.lesson_8.home_tasks.testing_arrays;

public class Arrays {
    public static void main(String[] args) {/*
        Двумерные массивы - матрица/ТАБЛИЦА , то есть
        123
        325
        954
        Чтобы обратиться к числу здесь, нужен не один индекс, а два ([x][x]), первое число - номер строки, второе - номер столбца.
         */

        int[][] matrix = {{10,20,30},
                            {40,50,60},
                            {70,80,90},
                            {11,12,13}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
