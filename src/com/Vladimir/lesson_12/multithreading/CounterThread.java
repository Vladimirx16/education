package com.Vladimir.lesson_12.multithreading;

public class CounterThread extends Thread {

    private Counter counter;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    public void run() {
        counter.increaseCounter();
        System.out.println("Поток " + getName() + " увеличил счётчик на 1. Новое значение счётчика - " + counter.getCounter());
    }

}
