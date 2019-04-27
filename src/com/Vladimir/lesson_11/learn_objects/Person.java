package com.Vladimir.lesson_11.learn_objects;

public class Person extends Object{
    private String name, surname;
    public String gender;
    public int passportNumber, age;
    private boolean isMarried;

    Person (String name, String surname, String gender, int passportNumber, int age, boolean isMarried) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.passportNumber = passportNumber;
        this.age = age;
        this.isMarried = isMarried;
    }

    public boolean equals(Person anotherPerson) {
        Person otherPerson = anotherPerson;
        if (otherPerson.passportNumber == this.passportNumber && otherPerson.age == this.age && otherPerson.age == this.age) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode(){
        return (age * passportNumber);
    }

    public boolean fullEquals(Person anotherPerson){
        Person otherPerson = anotherPerson;
        if (equals(otherPerson) && anotherPerson.hashCode() == this.hashCode()){
            return true;
        } else {
            return false;
        }
    }
}
