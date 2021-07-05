/* Create a class of objects Car with the public attributes speed, color, name and a boolean attribute is_police.
Define public methods for a car: go, stop, turn(direction) telling about the manoeuvre made.
The classes TownCar, SportCar, WorkCar, PoliceCar inherit attributes from the parent class Car.
Add a public method show_speed to display the current speed. Control the speed: alarm if a town car or a work car speed
up more than 60 and 40 correspondingly. */

package org.eho.test2;

import org.eho.test2.cars.Truck;
import org.eho.test2.cars.Vehicle;

class Main {
    public static void main(String[] args) {
        Vehicle truck1 = new Truck("Kamaz", 60, "green");
        truck1.getInfo();
    }
}



