package lesson_4.polymorphism_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList creatures = new ArrayList();

        creatures.add(new Human());
        creatures.add(new Bird());
        creatures.add(new Orc());

        for (int i = 0; i < creatures.size(); i++){
            Creature animal = (Creature) creatures.get(i);
            animal.printInformation();
        }
    }
}
