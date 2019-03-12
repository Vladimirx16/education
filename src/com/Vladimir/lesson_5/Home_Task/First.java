package com.Vladimir.lesson_5.Home_Task;

public class First {
    public String model = setModel("Ford");
    public String typeOfFuel;
    public static String colour = "красный";
    public static String typeOfTransmission;

    public String setModel(String model){
        return model;
    }

    public First(){
        System.out.println("Инициализация First 1");
    }

    static {
        System.out.println("Инициализация First 2");
    }
    static {
        System.out.println("Инициализация First 3");
    }
    {
        System.out.println("Инициализация First 4");
    }
    {
        System.out.println("Инициализация First 5");
    }
}
