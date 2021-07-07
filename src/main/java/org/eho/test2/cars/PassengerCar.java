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
}
