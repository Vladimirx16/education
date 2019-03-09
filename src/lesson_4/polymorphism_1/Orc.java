package lesson_4.polymorphism_1;

public class Orc extends Creature {
    private String kind = "Орк", name = "Саурон", gender = "Мужской";
    private int age = 1032, lengthOfFangs = 13; // Fang - клык
    public int getLengthOfFangs(){
        return lengthOfFangs;
    }
    public void setLengthOfFangs(int lengthOfFangs){
        this.lengthOfFangs = lengthOfFangs;
    }
    @Override
    public void printInformation(){
        System.out.println("Вид: " + kind);
        System.out.println("Имя: " + name);
        System.out.println("Пол: " + gender);
        System.out.println("Возраст: " + age);
        System.out.println("Длина клыков: " + lengthOfFangs);
        System.out.println("------------------------------------------------------------------");

    }
}
