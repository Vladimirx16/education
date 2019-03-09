package lesson_3;

import java.util.Scanner;

public class СompareDigits {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int first, second, third, fourth, minimal;
        System.out.println("Настала пора сравнивать числа! Введите первое число:");
        first = scr.nextInt();
        minimal = first; // Берём переменную, в которой будет мнимальное значение, и присваиваем ей значение первого числа.
        System.out.println("Введите второе число:");
        second = scr.nextInt();
        System.out.println("Введите третье число:");
        third = scr.nextInt();
        System.out.println("Введите четвёртое число:");
        fourth = scr.nextInt();
        int[] answer = {first, second, third, fourth};
        for (int i = 0; i < 4; i++){
            if(answer[i] < minimal){
                minimal = answer[i];
            }
        }
        System.out.println("Минимальное число - " + minimal);
    }
}
