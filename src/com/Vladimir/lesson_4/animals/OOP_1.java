package com.Vladimir.lesson_4.animals;

public class OOP_1 {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.setName("Барсик");
        barsik.setGender("мужской");
        barsik.setWeight(10);
        barsik.giveInforamation();

        Cat thomas = new Cat();
        thomas.setName("Томас");
        thomas.setGender("мужской");
        thomas.setWeight(22);
        thomas.giveInforamation();
    }
}