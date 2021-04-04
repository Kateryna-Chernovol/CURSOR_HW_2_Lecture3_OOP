package com.karmerdero;

public class Circle {
    /*1. Написать класс Circle (круг) и
    метод, который будет возвращать его площадь.
    Площа круга S = πr2, де π = 3,14,
    r – радіус круга.*/
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
