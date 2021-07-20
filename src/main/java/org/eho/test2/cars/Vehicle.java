package org.eho.test2.cars;

public abstract class Vehicle implements Engine, Light {

    protected int speed_limit; // max speed allowed
    protected String color; // color
    protected String name; // model name
    protected Integer speed; // speed of the vehicle
    protected boolean is_police;  // indicates if it is a police car

    public Vehicle() {
    }

    public Vehicle(String name, String color) {

        this.name = name;
        this.color = color;

    }

    public void getInfo() {
        System.out.println("Model: " + name +
                ", color is " + color + ", speed is " + speed +
                ", speed limit is " + speed_limit);
    }

    public int getSpeed_limit() {
        return speed_limit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed_limit(int speed_limit) {
        this.speed_limit = speed_limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        /* Check the speed of a vehicle
        If the speed is below zero: indicate the error and terminate execution.
        if the speed is above the limit: signal and set the speed to the limit */

        if (speed < 0) {
            System.out.println("Speed is negative: " + speed);
            System.exit(1);
        } else if (speed > speed_limit) {
            System.out.println("Speed limit: " + speed_limit);
            System.out.println("Speed is over limit: " + speed);
            this.speed = speed;
        } else {
            this.speed = speed;
        }
    }

    public boolean isIs_police() {
        return is_police;
    }

    public void setIs_police(boolean is_police) {
        this.is_police = is_police;
    }
}
