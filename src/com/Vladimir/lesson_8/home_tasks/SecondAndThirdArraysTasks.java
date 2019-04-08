package com.Vladimir.lesson_8.home_tasks;

public class SecondAndThirdArraysTasks {
    public static void main(String[] args) {

        int maximumPlace = 0; // Для 4 задания, место максимального элемента в массиве
        int minimumPlace = 0; // Для 4 задания, место минимального элемента в массиве

        /*
        Второе задание
         */

        int count = 0; // count для счёта количества минимальных элементов в массиве
        int[] array = {43, 75, 87, 87, 664, 36, 42, 11, 15, 98, 91, 76, 85, 56, 65}; // Дан массив с рандомными числами
        System.out.print("2)Дан массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Используется для переноса строки
        int minimum = array[0]; // Переменная minimum хранит минимальное значение массива, по умолчанию - первый элемент массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum){ // Если элемент в массиве меньше minimum, то minimum'у присваивается значение этого элемента. Счётчик минимальных чисел этого эквивалента обнуляется
                minimum = array[i];
                count = 0;
                minimumPlace = i;
            }
            if (minimum == array[i]){
                count ++; // Если минимальный элемент равен элементу в массиве, счётчик минимальных элементов с одинаковым значением увеличивается на 1
            }
        }
        if (count > 1){
            System.out.print("Минимальные элементы в данном массиве: ");
        } else {
            System.out.print("Минимальный элемент в данном массиве: ");
        }
        for (int i = 0; i < count; i++) { // Выводятся все найденне минимальные элементы
            System.out.print(minimum + " ");
        }
        System.out.println(); // Используется для переноса строки

        /*
        Третье задание
         */

        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum){
                maximum = array[i];
                maximumPlace = i;
            }
        }

        System.out.println("3)Максимальный элемент в данном массиве: " + maximum);

        /*
        Четвёртое задание
         */

        System.out.println("4)Меняем максимальный и минимальный элемент в массиве местами...");
        array[minimumPlace] = maximum;
        array[maximumPlace] = minimum;
        System.out.print("Получившийся массив: ");
        for (int i1 : array) {
            System.out.print(i1 + " ");
        }
        System.out.println(); // Используется для переноса строки

        /*
        Пятое задание
         */

        System.out.println("5)Находим среднее арифметическое всех элементов массива...");
        int summa = 0, average = 0; // average - среднее арифметическое
        for (int i1 : array) {
            summa += i1; // Находим сумму всех элементов
        }
        average = summa / array.length; // Вычисляем среднее арифметическое
        System.out.println("Среднее арифметическое всех элементов массива: " + average);
    }
}