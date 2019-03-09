package lesson_4.polymorphism_1;

public class Bird extends Creature {
    private  String kind = "Птица", gender = "Женский";
    private int age = 2, lengthOfWings = 30; // Wings - крылья
    public int getLengthOfWings(){
        return lengthOfWings;
    }
    public void setLengthOfWings(int lengthOfWings){
        if (lengthOfWings < 0){
            System.out.println("Длина крыльев не может быть отрицательной!");
        }else{
            this.lengthOfWings = lengthOfWings;
        }
    }
    @Override
    public void printInformation(){
        System.out.println("Вид: " + kind);
        System.out.println("Пол: " + gender);
        System.out.println("Возраст: " + age);
        System.out.println("Размах крыльев: " + lengthOfWings);
        System.out.println("------------------------------------------------------------------");
    }
}
