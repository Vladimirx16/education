package com.Vladimir.lesson_10.Homework.learn_maps;

public class Person {
    private String name = null;
    private int id, age;

    /* Просто конструктор */
    Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    /* Просто геттеры */
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }

}
