package com.Vladimir.lesson_5.Presentation_Task;

public class Second extends First {
    private String name = "Mohamed";
    private int salary = 120000, age = 21;

    public void printSalary(){
        System.out.println("Зарплата - " + salary);
    }
    public void printAge(){
        System.out.println("Возраст - " + age);
    }

    @Override
    public void printName(){
        System.out.println("Имя второго - " + name);
    }
}
