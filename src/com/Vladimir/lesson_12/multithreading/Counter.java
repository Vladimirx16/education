package com.Vladimir.lesson_12.multithreading;

public class Counter {
    /*private volatile int counter = 0; ПЕРВЫЙ СПОСОБ ПОТОКОБЕЗОПАСНОСТИ */
    private int counter = 0;

    /*public synchronized void increaseCounter() {
        counter++;
    }
    ВТОРОЙ СПОСОБ ПОТОКОБЕЗОПАСНОСТИ
    */

    public void increaseCounter() { // ТРЕТИЙ СПОСОБ ПОТОКОБЕЗОПАСНОСТИ
        synchronized (this) {
            counter++;
        }
    }

    public int getCounter(){
        return counter;
    }
}
