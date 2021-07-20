/* Create a class of objects Car with the public attributes speed, color, name and a boolean attribute is_police.
Define public methods for a car: go, stop, turn(direction) telling about the manoeuvre made.
The classes TownCar, SportCar, WorkCar, PoliceCar inherit attributes from the parent class Car.
Add a public method show_speed to display the current speed. Control the speed: alarm if a town car or a work car speed
up more than 60 and 40 correspondingly. */

package org.eho.test2;

import org.eho.test2.cars.PassengerCar;
import org.eho.test2.cars.PoliceCar;
import org.eho.test2.cars.Truck;
import org.eho.test2.cars.Vehicle;

import java.util.Arrays;
import java.util.List;


class Main {
    public static void main(String[] args) {
        Vehicle truck1 = new Truck("Kamaz", 60, "green");
        truck1.setSpeed_limit(80);
        Truck truck2 = new Truck(); // initialize the object of class Truck with the empty constructor
        System.out.println(truck2.unload());
        System.out.println(truck2.unload("red"));
        PassengerCar car1 = new PassengerCar("Lada sedan", 50, "baklazhan", 5);
        System.out.println(car1.getCapacity());
        Vehicle car2 = new PassengerCar("Lada priora", 91, "black", 5);
        Vehicle cop1 = new PoliceCar("Ford Crown Victoria", 99, "white");
        System.out.println("Is it a police car: " + cop1.isIs_police());

        List<Vehicle> vehicles = Arrays.asList(car1, car2, truck1, truck2, cop1);
        for (Vehicle vehicle : vehicles) {
            initCar(vehicle);
        }

    }

    static void initCar(Vehicle vehicle){
        vehicle.getInfo();
        vehicle.startEngine();
        vehicle.turnOnLight();
    }
}



