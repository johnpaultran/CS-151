package Lecture9and10;

import java.util.ArrayList;

    interface Vehicle {
        void refuel();
    }

    class ElectricCar implements Vehicle {
        @Override
        public void refuel() {
            System.out.println("Go to supercharger");
        }

        public void ride() {
            System.out.println("Moving silently");
        }
    }

    class Motorcycle implements Vehicle {
        @Override
        public void refuel() {
            System.out.println("Vroooom... to gas station");
        }

        public void ride() {
            System.out.println("Vrooom...");
        }
    }

    class Garage {
        private ArrayList<Vehicle> garage;

        public Garage() {
            garage = new ArrayList<>();
        }

        public void addToGarage(Vehicle vehicle) {
            this.garage.add(vehicle);
        }

        public void refuelAll() {
            for (Vehicle v : garage) {
                v.refuel();
            }
        }

        public void haveFun() {
            for (Vehicle v : garage) {
                // v.ride() ??
            }
        }
    }

class Test {
    public static void main(String[] args) {
        Garage myCoolGarage = new Garage();

        Motorcycle m = new Motorcycle();
        ElectricCar e = new ElectricCar();

        myCoolGarage.addToGarage(m);
        myCoolGarage.addToGarage(e);
        myCoolGarage.addToGarage(new ElectricCar());

        myCoolGarage.refuelAll();
    }
}








