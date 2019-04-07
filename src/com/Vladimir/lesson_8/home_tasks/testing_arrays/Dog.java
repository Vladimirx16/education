package com.Vladimir.lesson_8.home_tasks.testing_arrays;

public class Dog {
    private String name, color;
    private int age;

    public Dog (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
    public void bark(){
        System.out.println("Собака с именем " + name + " лает!");
    }
}