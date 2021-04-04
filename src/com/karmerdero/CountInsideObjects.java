package com.karmerdero;

public class CountInsideObjects {
    /*2. Написать класс, который умеет считать
    количество созданных объектов этого класса.*/

    public static int objCount;

    CountInsideObjects() {
        objCount++;
    }

    public static void print() {
        System.out.println("Task#2\n" + "Objects quantity in this class: " + objCount);
    }

}
