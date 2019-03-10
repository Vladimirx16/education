package com.Vladimir.lesson_4.magick;

import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Knight George = new Knight();
        George.setCharacteristic();
        George.printInformation();

        Hero Joseph = new Hero();
        Joseph.setCharacteristic();
        Joseph.printInformation();

        Knight Vladimir = new Knight();
        Vladimir.setCharacteristic();
        Vladimir.printInformation();
    }
}