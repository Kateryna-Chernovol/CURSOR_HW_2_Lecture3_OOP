package com.karmerdero;
import java.util.Scanner;

public class Car {
    /*Написать класс «автомобиль», который
     должен уметь заводится, глушить мотор,
     ехать и держать необходимую скорость.*/

    private boolean engineWork = false;
    private int speed = 0;
    private boolean cruiseControl = false;

    public boolean start() {
        engineWork = true;
        System.out.println("Ready to drive");
        return engineWork;
    }

    public void addSpeed(int km){
        if ((engineWork = true) || (km > 0) || ((speed + km) < 180)){
            cruiseControl = false;
            speed += km;
            km = speed;
            System.out.println("Speed increased to " + km + "km/h");
        } else {
            System.out.println("Can`t add to your speed" + km + "km/h");
            System.out.println("Choose other speed value");
        }
    }

    public void decreaseSpeed(int km){
        if ((engineWork = true) || ((speed - km) > 0)){
            cruiseControl = false;
            speed -= km;
            km = speed;
            System.out.println("Speed decreased to " + km + "km/h");
        } else {
            System.out.println("Can`t decrease to your speed" + km + "km/h");
            System.out.println("Choose other speed value");
        }
    }

    public void setCruiseControl (int km){
        if ((engineWork = true) || (km > 45) || (km < 90)){
            cruiseControl = true;
            speed = km;
            System.out.println("Cruise control with speed " + km + " km/h");
        } else {
            System.out.println("Choose other speed to set cruise control");
        }
    }

    public boolean stopAllProcesses(){
        engineWork = false;
        speed = 0;
        System.out.println("Engine was successfully stopped");
        return engineWork;
    }

}