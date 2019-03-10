package com.Vladimir.lesson_4.polymorphism_1;

public class Creature {
    private String kind, gender;
    private int age;
    public String getKind(){
        return  kind;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public void setName(String kind){
        this.kind = kind;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void printInformation(){
        System.out.println("Вид: " + kind);
        System.out.println("Пол: " + gender);
        System.out.println("Возраст: " + age);
    }
}
