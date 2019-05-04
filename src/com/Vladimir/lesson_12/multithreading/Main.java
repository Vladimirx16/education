package com.Vladimir.lesson_12.multithreading;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            Thread myThread = new CounterThread(counter);
            myThread.start();
        }
        while(true){
            System.out.println("Значение счётчика - " + counter.getCounter());
        }
    }
}
