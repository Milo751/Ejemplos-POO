package POO.Abstraccion;

import POO.Encapsulamiento.BankAccount;

public class Main {
    static void main(String[] args) {
        // Vehicle carro = new Vehicle("Ferrari", "Urus", 2026)
        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000) {
            @Override
            public void drive() {
                System.out.println("Estoy conduciendo");
            }
        };
        System.out.println(vehicle.toString());

        ElectricCar carro = new ElectricCar(80, Color.BLACK);
        carro.chargeBattery();
    }
}
