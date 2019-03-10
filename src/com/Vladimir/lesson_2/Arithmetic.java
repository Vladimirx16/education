package com.Vladimir.lesson_2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число месяца: ");
        int date = sc.nextInt();
        if (date == 1){
            System.out.println("Введённый месяц - январь, время года - зима. Только что прошёл новый год");
        }else if(date == 2){
            System.out.println("Введёный месяц - февраль, время года - зима");
        }else if(date == 3){
            System.out.println("Введёный месяц - март, время года - весна");
        }else if(date == 4){
            System.out.println("Введёный месяц - апрель, время года - весна");
        }else if(date == 5){
            System.out.println("Введёный месяц - май, время года - весна");
        }else if(date ==6){
            System.out.println("Введёный месяц - июнь, время года - лето");
        }else if(date == 7){
            System.out.println("Введёный месяц - июль, время года - лето");
        }else if(date == 8){
            System.out.println("Введёный месяц - август, время года - лето");
        }else if(date == 9){
            System.out.println("Введёный месяц - сентябрь, время года - осень. Поздравляю, пора в школу");
        }else if(date == 10){
            System.out.println("Введёный месяц - октябрь, время года - осень");
        }else if(date == 11){
            System.out.println("Введёный месяц - ноябрь, время года - осень");
        }else if(date == 12){
            System.out.println("Введёный месяц - декабрь, время года - осень");
        }
    }
}
