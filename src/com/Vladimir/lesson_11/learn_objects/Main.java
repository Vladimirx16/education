package com.Vladimir.lesson_11.learn_objects;

import java.util.Scanner;

public class Main {

    public static Person createPerson(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя человека: ");
        String name = input.next();
        System.out.print("Введите фамилию человека: ");
        String surname = input.next();
        System.out.print("Введите пол человека: ");
        String gender = input.next();
        System.out.print("Введите шестизначный номер пасспорта человека: ");
        int passportNumber = input.nextInt();
        System.out.print("Введите возраст человека: ");
        int age = input.nextInt();
        System.out.print("Женат ли человек [Да]/[Нет]: ");
        String isPersonMarried = input.next();
        boolean isMarried;
        if (isPersonMarried.toLowerCase().equals("да")){
            isMarried = true;
        } else { isMarried = false; }
        Person person = new Person(name, surname, gender, passportNumber, age, isMarried);
        return person;
    }

    public static void main(String[] args) throws TwoSamePersonsException {

        Person firstPerson = createPerson();
        Person secondPerson = createPerson();

        System.out.println("Сравниваем двух людей...");

        if (firstPerson.fullEquals(secondPerson)) {
            System.out.println("Сравнение завершено...");
            throw new TwoSamePersonsException("Это два одинаковых человека!");
        } else {
            System.out.println("Сравнение завершено...\nЭто два разных человека!");
        }

}}
