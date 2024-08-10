// 4. Vehicle Inheritance:
// Create a class named Vehicle with attributes like model, year, and color.
// Create subclasses for Car, Motorcycle, and Truck inheriting from Vehicle.
// Add specific attributes and methods for each vehicle type (e.g., numberOfDoors for Car,
// engineCapacity for Motorcycle).
// Implement a method to display vehicle details for each type.

import java.util.ArrayList;

class Vehicle {
    String model, color;
    int year;

    Vehicle(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void details() {
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(int numberOfDoors, String model, String color, int year) {
        super(model, color, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void details() {
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
        System.out.println("Number of doors: " + this.numberOfDoors);
    }
}

class Motorcycle extends Vehicle {
    int engineCapacity;

    Motorcycle(int engineCapacity, String model, String color, int year) {
        super(model, color, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    void details() {
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
        System.out.println("Engine capacity: " + this.engineCapacity);
    }
}

class Truck extends Vehicle {
    Truck(String model, String color, int year) {
        super(model, color, year);
    }

    @Override
    void details() {
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
    }
}

public class ex4 {
    public static void main(String[] args) {
        Car c1 = new Car(4, "Toyota", "White", 2019);
        Motorcycle m1 = new Motorcycle(100, "Honda", "Red", 2017);
        Truck t1 = new Truck("Truck", "Black", 2020);

        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(c1);
        list.add(m1);
        list.add(t1);

        for (Vehicle v : list) {
            v.details();
            System.out.println();
        }
    }
}

