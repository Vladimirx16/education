package com.Vladimir.lesson_4.triangles_trying;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     Triangle triangle_1 = new Triangle();
     triangle_1.setSideA(input.nextInt());
     triangle_1.setSideB(input.nextInt());
     triangle_1.setSideC(input.nextInt());
        System.out.println(triangle_1.getPerimeter() + " - периметр заданного треугольника.");
        System.out.println(triangle_1.getSquare() + " - площадь заданного треугольника");
    }
}
