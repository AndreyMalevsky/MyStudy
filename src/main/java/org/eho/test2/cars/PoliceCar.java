package org.eho.test2.cars;

public class PoliceCar extends Vehicle {
    public PoliceCar(String name, Integer speed, String color) {
        super(name, color);
        speed_limit = 300;
        is_police = true;
        setSpeed(speed);
    }
}
