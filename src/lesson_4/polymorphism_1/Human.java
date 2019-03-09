package lesson_4.polymorphism_1;

public class Human extends Creature {
    private String kind = "Человек", name = "Вовчик", gender = "Мужской", surname = "*засекречено*";
    private int age = 18;
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    @Override
    public void printInformation(){
        System.out.println("Вид: " + kind);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Пол: " + gender);
        System.out.println("Возраст: " + age);
        System.out.println("------------------------------------------------------------------");
    }
}
