package POO.Abstraccion;

public class ElectricCar implements Electric{
    private int batteryLevel;
    private Color color;

    public ElectricCar(int batteryLevel, Color color) {
        this.batteryLevel = batteryLevel;
        this.color = color;
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("La bateria esta cargada al 100%");
    }
}
