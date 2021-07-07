package org.eho.test2.cars;

public class Truck extends Vehicle{
    public Truck(String name, Integer speed, String color) {
        super(name, speed, color);
        speed_limit = 80;  // Это выражение должно выполняться раньше инициализации экземпляра класса Truck //
        is_police = false;
    }
}
