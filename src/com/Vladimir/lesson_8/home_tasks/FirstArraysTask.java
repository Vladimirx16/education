package com.Vladimir.lesson_8.home_tasks;

public class FirstArraysTask {
    public static void main(String[] args) {
        System.out.println("1)Создаём массив...");
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.print("Выводим все элементы массива: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numbers[numbers.length-1]){
                System.out.print(numbers[i] + ", ");
            }
            else {
                System.out.print(numbers[i] + ".");
            }
        }
    }
}
