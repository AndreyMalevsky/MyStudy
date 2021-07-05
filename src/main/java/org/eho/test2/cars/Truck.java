package org.eho.test2.cars;

public class Truck extends Vehicle{
    public Truck(String name, Integer speed, String color) {
        super(name, speed, color);
        speed_limit = 80;
        is_police = false;
    }
}
