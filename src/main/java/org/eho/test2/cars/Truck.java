package org.eho.test2.cars;

public class Truck extends Vehicle implements Engine {
    public Truck(String name, Integer speed, String color) {

        super(name, color);
        speed_limit = 80;
        is_police = false;
        setSpeed(speed);
    }

    public boolean unload() {
        return true;
    }

    public boolean unload(String color) {
        return false;
    }

    public Truck() {
    }
    @Override
    public void startEngine() {
        System.out.println("Engine of " + color + " " + name + " is running");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Light of " + color + " " + name + " is on");
    }
}
