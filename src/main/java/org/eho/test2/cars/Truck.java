package org.eho.test2.cars;

public class Truck extends Vehicle {
    public Truck(String name, Integer speed, String color) {

        super(name, color);
        speed_limit = 80;
        is_police = false;
        setSpeed(speed);
    }

    public float unload() {
        return 1;
    }

    public float unload(String color) {
        return 0;
    }
    public Truck() {
    }
}
