package com.Vladimir.lesson_10.Homework.learn_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LearningMaps {

    public static boolean isUserExist(String login, String password, HashMap users){
        if (users.containsKey(login)) {
            User thisUser = (User) users.get(login);
            return thisUser.getPassword().equals(password);
        }
        return false;
    }

    public static void fillData(HashMap data, ArrayList names){
        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать в интерфейс управления базой данных.\nКакое количество человек будет добавлено в базу данных: ");
        int lengthOfData = input.nextInt();
        System.out.println("Вам доступна функция добавления людей в базу данных.\n>>>");
        for (int i = 0; i < lengthOfData; i++) {
            System.out.print("Имя: ");
            String name = input.next();
            System.out.print("ID: ");
            int id = input.nextInt();
            System.out.print("Возраст: ");
            int age = input.nextInt();
            System.out.println(">>>");
            Person person = new Person(name, id, age);
            data.put(name, person);
            names.add(name); // Имена добавленных людей
        }
    }

    public static void checkProfile(HashMap data, ArrayList names){
        System.out.println("Список добавленных людей: " + names);
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
        ArrayList<String> names = new ArrayList<>();
        HashMap<String, User> users = new HashMap<>();


        while(true){
            Scanner input = new Scanner(System.in);

            System.out.println("Выберите действие: [Войти]/[Закончить]/[Зарегистрироваться]");

            String firstChoice = input.next();
            if (firstChoice.toLowerCase().equals("войти")) {

                System.out.print("Логин: ");
                String login = input.next();
                System.out.print("Пароль: ");
                String password = input.next();

                if (isUserExist(login, password, users)) {
                    System.out.println("Вы успешно вошли!\n>>>");
                    boolean constant = true;
                    while (constant) {
                        System.out.println("Выберите дальнейшее действие: [Добавить]/[Очистить]/[Просмотреть]/[Отсортировать]/[Админ]/[Выйти]");
                        String choice = input.next();

                        switch (choice.toLowerCase()) {
                            case "добавить":
                                fillData(data, names);
                                break;
                            case "очистить":
                                data.clear();
                                System.out.println("База данных успешно очищена!\n>>>");
                                break;
                            case "просмотреть":
                                checkProfile(data, names);
                                break;
                            case "отсортировать":
                                System.out.println("Данная функция в разработке...\n>>>");
                                break;
                            case "админ":

                                break;
                            case "выйти":
                                System.out.println("Вы успешно вышли!\n>>>");
                                constant = false;
                                break;
                            default:
                                System.out.println("Вы ввели неверную команду!\n>>>");
                        }
                    }
                } else {
                    System.out.println("Вы ввели неверный логин или пароль! Попробуйте снова.\n>>>");
                } } else if (firstChoice.toLowerCase().equals("закончить")){ break; }
            else if (firstChoice.toLowerCase().equals("зарегистрироваться")) {
                while (true) {
                    System.out.print("Новый логин: ");
                    String login = input.next();
                    System.out.print("Новый пароль: ");
                    String password = input.next();
                    System.out.print("Введите пароль ещё раз: ");
                    String checkPassword = input.next();
                    if (checkPassword.equals(password)) {
                        User user = new User(login, password);
                        users.put(login, user);
                        System.out.println("Вы успешно зарегистрировались! Ваш логин: " + login + " ; Ваш пароль: " + password + "\n>>>");
                        break;
                    } else {
                        System.out.println("Пароли не совпадают!\n>>>");
                    }
                }
            }
        }
    }
}
