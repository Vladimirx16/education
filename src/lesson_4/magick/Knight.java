package lesson_4.magick;

import java.util.Scanner;

public class Knight {
    Scanner input = new Scanner(System.in);
    private String name = "не определено", race = "не определена", gender = "не определён", weapon = "не определено";
    private int age = 0, height = 0;

    public String getName(){
        return name;
    }
    public String getRace(){
        return race;
    }
    public String getGender(){
        return gender;
    }
    public String getWeapon(){
        return weapon;
    }
    public int getAge(){return age;}
    public int getHeight(){return height;}
    public void setName(String name){
        if (name.equals("дурачок")){
            System.out.println("Введено некорректное имя!");
        }else{
            this.name = name;
        }
    }
    public void setRace(String race){
        if (race.equals("лошинная")){
            System.out.println("Введена некорректная раса!");
        }else{
            this.race = race;
        }
    }
    public void setGender(String gender){
        gender = gender.toLowerCase();
        if (gender.equals("м")){
            gender = "Мужской";
            this.gender = gender;
        }else if (gender.equals("ж")){
            gender = "Женский";
            this.gender = gender;
        }else{
            System.out.println("Введёт некорректный пол!");
        }
    }
    public void setWeapon(String weapon){
        if (weapon.equals("банан")){
            System.out.println("Это не оружие!");
        }else{
            this.weapon = weapon;
        }
    }
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }else{
            System.out.println("Введён отрицательный возраст!");
        }
    }
    public void setHeight(int height){
        if (height > 0){
            this.height = height;
        }else{
            System.out.println("Введён отрицательный рост!");
        }
    }
    public void setCharacteristic(){
        System.out.println("Имя персонажа:");
        setName(input.next());
        System.out.println("Пол персонажа:");
        setGender(input.next());
        System.out.println("Раса персонажа:");
        setRace(input.next());
        System.out.println("Возраст персонажа:");
        setAge(input.nextInt());
        System.out.println("Рост персонажа:");
        setHeight(input.nextInt());
        System.out.println("Оружие персонажа:");
        setWeapon(input.next());
    }
    public void printInformation(){
        System.out.println("-------------Характеристики рыцаря-------------");
        System.out.println("Имя рыцаря: " + getName());
        System.out.println("Пол рыцаря: " + getGender());
        System.out.println("Раса рыцаря: " + getRace());
        System.out.println("Возраст рыцаря: " + getAge());
        System.out.println("Рост рыцаря: " + getHeight());
        System.out.println("Используемое оружие рыцаря: " + getWeapon());
        System.out.println("-----------------------------------------------");
    }
}
