package lesson_3;

import java.util.Scanner;

public class IsLucky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Давайте проверим, счастливый ли у вас билет.");
        int[] digits = new int[6];
        for (int i = 0; i < 6; i++){
            System.out.println("Введите " + (i+1) + "-ую цифру с билета:");
            digits[i] = input.nextInt();
        }
        if ((digits[0] + digits[1] + digits[2]) == (digits[3] + digits[4] + digits[5])){
            System.out.println("Поздравляю, билет со значением " + digits[0] + digits[1] + digits[2] + digits[3] + digits[4] + digits[5] + " - счастливый!");
        }else{
            System.out.println("Повезёт в другой раз...");
        }
    }
}
