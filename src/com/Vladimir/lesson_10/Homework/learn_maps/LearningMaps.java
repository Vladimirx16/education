package com.Vladimir.lesson_10.Homework.learn_maps;

import java.util.HashMap;
import java.util.Scanner;

public class LearningMaps {

    public static void fillData(HashMap data){
        Scanner input = new Scanner(System.in);
        System.out.print("Какое количество человек будет добавлено в базу данных: ");
        int lengthOfData = input.nextInt();
        System.out.println("Вам доступна функция добавления людей в базу данных.\n \nВводите данные в формате:\nИмя\nID\nВозраст\n>>>");
        for (int i = 0; i < lengthOfData; i++) {
            String name = input.next();
            int id = input.nextInt(), age = input.nextInt();
            System.out.println(">>>");
            Person person = new Person(name, id, age);
            data.put(name, person);
        }
    }

    public static void checkProfile(HashMap data){
        System.out.println("Введите имя человека, чтобы посмотреть его профиль.");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        if (data.containsKey(name)){
            Person person = (Person) data.get(name);
            System.out.println("Имя - " + person.getName() + "\nID - " + person.getId() + "\nВозраст - " +person.getAge() + "\n>>>");
        } else{
            System.out.println("Такого пользователя не существует!\n>>>");
        }
    }

    public static void main(String[] args) {
        HashMap<String, Person> data = new HashMap<>(10);

        fillData(data);

        while(true){
            System.out.println("Выберите дальнейшее действия: [Войти]/[Отсортировать]/[Закончить]");
            Scanner input = new Scanner(System.in);
            String choice = input.next();
            if (choice.toLowerCase().equals("войти")){
            checkProfile(data);
            } else if (choice.toLowerCase().equals("закончить")){
                break;
            } else if (choice.toLowerCase().equals("отсортировать")) {
                System.out.println("Функция пока что не готова...\n>>>");
            } else {
                System.out.println("Вы ввели неверную команду!\n>>>");
            }
        }

    }
}
