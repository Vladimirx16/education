package com.Vladimir.lesson_4.polymorphism;

import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {
        ArrayList figures = new ArrayList();
        figures.add(new Point());
        figures.add(new LineSegment());
        figures.add(new Triangle());

        for (int i = 0; i < figures.size(); i++){
            Point figure = (Point) figures.get(i);
            System.out.println(figure.getDescription());
            System.out.println("Площадь: " + figure.getSquare());
            System.out.println("Периметр: " + figure.getPerimeter());
        }
    }
}
