package org.eho.test2.cars;

    public class PassengerCar extends Vehicle {
        private int capacity;

        public PassengerCar(String name, Integer speed, String color, int capacity) {
            super(name, color);
            speed_limit = 90;
            is_police = false;
            this.capacity = capacity;
            setSpeed(speed);
        }
        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        @Override
        public void startEngine() {
            System.out.println("Engine of " + color + " " + name + " is running");
            System.out.println(capacity + " people can get in");
        }

        @Override
        public void turnOnLight() {
            System.out.println("Light of " + color + " " + name + " is on");
        }
    }
