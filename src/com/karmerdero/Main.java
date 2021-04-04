package com.karmerdero;

public class Main {

    public static void main(String[] args) {

        Circle myCircle = new Circle(5);
        String resultCircle = String.format("%.3f",myCircle.getArea());
        System.out.println("Task#1\n" +
                "Circle area: " + resultCircle + "\n");

        CountInsideObjects objOne = new CountInsideObjects();
        CountInsideObjects ObjTwo = new CountInsideObjects();
        CountInsideObjects ObjThree = new CountInsideObjects();
        CountInsideObjects.print();
        System.out.println();

        System.out.println("Task #3 \"My Car\"");
        Car myCar = new Car();
        myCar.start();
        myCar.addSpeed(50);
        myCar.addSpeed(30);
        myCar.setCruiseControl(75);
        myCar.decreaseSpeed(20);
        myCar.stopAllProcesses();
    }
}
