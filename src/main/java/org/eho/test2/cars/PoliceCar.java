package org.eho.test2.cars;

public class PoliceCar extends Vehicle implements Engine {
    public PoliceCar(String name, Integer speed, String color) {
        super(name, color);
        speed_limit = 300;
        is_police = true;
        setSpeed(speed);
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
