package com.Vladimir.lesson_4.animals;

public class Cat {
    private String name, gender;
    private int weight;
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getWeight(){
        return weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void giveInforamation(){
        System.out.println("Имя кошки: " + getName());
        System.out.println("Пол кошки: " + getGender());
        System.out.println("Вес кошки: " + getWeight() + " кг");
    }
}
