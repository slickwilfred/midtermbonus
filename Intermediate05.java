package org.bcit.midterm.questions;

import java.util.ArrayList;

public class Intermediate05 {
    public static void main(String[] args) {
        ArrayList<Intermediate05Car> cars = new ArrayList<>();
        ArrayList<Intermediate05Boat> boats = new ArrayList<>();
        ArrayList<Intermediate05Acceleratable> acceleratables = new ArrayList<>();
        ArrayList<Intermediate05Deceleratable> deceleratables = new ArrayList<>();

        Intermediate05SportsCar sportsCar = new Intermediate05SportsCar("Ferrari", 150);
        cars.add(sportsCar);
        acceleratables.add(sportsCar);
        deceleratables.add(sportsCar);

        Intermediate05FamilyCar familyCar = new Intermediate05FamilyCar("Toyota", 100);
        cars.add(familyCar);
        acceleratables.add(familyCar);
        deceleratables.add(familyCar);

        Intermediate05SpeedBoat speedBoat = new Intermediate05SpeedBoat("Yamaha", 70);
        boats.add(speedBoat);
        acceleratables.add(speedBoat);
        deceleratables.add(speedBoat);

        Intermediate05SailBoat sailBoat = new Intermediate05SailBoat("Beneteau", 30);
        boats.add(sailBoat);
        acceleratables.add(sailBoat);
        deceleratables.add(sailBoat);

        for (Intermediate05Acceleratable acceleratable : acceleratables) {
            acceleratable.accelerate();
        }

        for (Intermediate05Deceleratable deceleratable : deceleratables) {
            deceleratable.decelerate();
        }
    }
}

/*
Intermediate05: Vehicles and Speeds

The diagram for Intermediate Question 05 shows a system of classes related to vehicles, speeds, and their functionalities. The classes are prefixed with Intermediate05_, and the system includes an abstract class called Car, with SportsCar and FamilyCar extending it. There is also an abstract class called Boat, which does not extend Car, with SpeedBoat and SailBoat extending it. The system also has two interfaces: Acceleratable and Deceleratable.

In the main method, there are four objects created, including sportsCar, familyCar, speedBoat, and sailBoat, and they are added to four ArrayLists: cars, boats, acceleratables, and deceleratables. The Acceleratable interface is implemented by sportsCar, familyCar, speedBoat, and sailBoat, and the Deceleratable interface is implemented by sportsCar, familyCar, speedBoat, and sailBoat. The accelerate() method is called on all objects that implement the Acceleratable interface, and the decelerate() method is called on all objects that implement the Deceleratable interface.

The objective of this question is to create a system of classes that allows for functionality related to vehicles and speeds, including accelerating and decelerating. The design of the classes and interfaces should follow SOLID principles, and the example methods in the interface and classes should be included in the implementation.

Your task is to implement the classes and interfaces for the Intermediate05 system



Both questions involve a system of classes and interfaces that follow SOLID principles. They require understanding of object-oriented programming, inheritance, and interface implementation.

Both questions involve creating multiple objects and adding them to appropriate ArrayLists. In the original question, objects are related to clocks and timers, while in the modified version, objects are related to vehicles.

In both questions, objects implement multiple interfaces. The original question has the Tickable and Alarmable interfaces, while the modified version has the Acceleratable and Deceleratable interfaces.

Both questions require invoking interface methods on objects that implement those interfaces. The original question calls the tick() method on objects implementing the Tickable interface and the setAlarm() method on objects implementing the Alarmable interface. In the modified version, the accelerate() method is called on objects implementing the Acceleratable interface, and the decelerate() method is called on objects implementing the Deceleratable interface.

Both questions test the understanding of class and interface relationships, as well as the usage of polymorphism in object-oriented programming. They challenge the developer to design a system of classes and interfaces to model different types of objects and their functionalities, while maintaining a clean and organized structure.

 */





