package lesson_3;

import java.util.Scanner;

public class TimeOfYear {
    public static void main(String[] args){
        String present, gender;
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать. Укажите свой пол(мужской или женский): ");
        gender = sc.next();
        System.out.println(gender);
        gender = gender.toLowerCase(); // Переводим полученную строку в нижний регистр
        System.out.println("Введите число месяца: ");
        int date = sc.nextInt();
        switch (date) {
            case 1: System.out.println("На дворе январь, только что прошёл новый год. Что вам подарили?");
                present = sc.next();
                System.out.println("Ого, " + present + "? Это замечательный подарок.");
                break;
            case 2:
                System.out.println("На дворе февраль.");
                if (gender.equals("мужской")) {
                    System.out.println("Что получили на 23 февраля?");
                    present = sc.next();
                    if (present.equals("носки") || present.equals("Носки")){
                        System.out.println("Как говорится, соблюдая традиции...");
                    } else{
                        System.out.println(present + "? Отличный подарок!");
                    }
                } else if (gender.equals("Женский") || gender.equals("женский")){
                    break;
                } break;
            case 3:
                System.out.println("На дворе март.");
                if (gender.equals("женский")){
                    System.out.println("Что получили на 8 марта?");
                    present = sc.next();
                    if (present.equals("Айфон") || present.equals("айфон") || present.equals("Iphone") || present.equals("iphone")){
                        System.out.println("Яблочко это отличный подарок.");
                    }else{
                        System.out.println(present + "? Поздравляю!");
                    } break;
                }
                break;
            case 4:
                System.out.println("На дворе декабрь. Кхм, с первым апреля!"); break;
            case 5:
                System.out.println("На дворе май, ЕГЭ близко."); break;
            case 6:
                System.out.println("На дворе июнь. С началом лета!"); break;
            case 7:
                System.out.println("На дворе июнь. Лето идёт полным ходом."); break;
            case 8:
                System.out.println("На дворе август. Последние летние деньки..."); break;
            case 9:
                System.out.println("На дворе сентябрь. С днём знаний."); break;
            case 10:
                System.out.println("На дворе октябрь."); break;
            case 11:
                System.out.println("На дворе ноябрь."); break;
            case 12:
                System.out.println("На дворе дкабрь. Скоро новый год."); break;
            default:
                System.out.println("Боюсь, такого месяца не существует.");
        }
    }
}
