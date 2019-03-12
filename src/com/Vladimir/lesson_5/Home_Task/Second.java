package com.Vladimir.lesson_5.Home_Task;

public class Second extends First {
    public String name = setName("Vova");
    public String surname;
    public static String name1 = "Valay";
    public static String surname1;

    public String setName(String name){
        return name;
    }

    public Second(){
        System.out.println("Иницилизация Second 1");
    }

    static {
        System.out.println("Инициализация Second 2");
    }
    static {
        System.out.println("Инициализация Second 3");
    }
    {
        System.out.println("Инициализация Second 4");
    }
    {
        System.out.println("Инициализация Second 5");
    }
}
