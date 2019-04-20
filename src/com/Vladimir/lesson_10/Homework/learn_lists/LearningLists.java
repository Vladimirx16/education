package com.Vladimir.lesson_10.Homework.learn_lists;

import java.util.*;

public class LearningLists {

    public static ArrayList createArrayList(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("Построчно введите 15 элементов:");
        for (int i = 0; i < 15; i++) {
            strings.add(input.next());
        }
        System.out.println("Добавленные элементы - " + strings + "\n" + ">>>");
        return strings;
    }

    public static ArrayList clearByHashSet(ArrayList thisArrayList){
        Set<String> set = new HashSet<>(thisArrayList);
        thisArrayList.clear();
        thisArrayList.addAll(set);
        return thisArrayList;
    }

    public static ArrayList clearByLinkedHashSet(ArrayList thisArrayList){
        Set<String> set = new LinkedHashSet<>(thisArrayList);
        thisArrayList.clear();
        thisArrayList.addAll(set);
        return thisArrayList;
    }

    public static void main(String[] args) {

        /*Первый способ очистки дубликатов*/

        ArrayList<String> buffer;
        buffer = createArrayList();
        System.out.println("Удаляем дубликаты...");
        clearByHashSet(buffer);
        System.out.println("Новый список - " + buffer + "\n" + ">>>");

        /*Второй способ очистки дубликатов*/

        buffer.clear();
        buffer = createArrayList();
        System.out.println("Удаляем дубликаты...");
        clearByLinkedHashSet(buffer);
        System.out.println("Новый список - " + buffer + "\n" + ">>>");

    }
}
