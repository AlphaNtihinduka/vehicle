public abstract class Vehicle {
    String type;
    int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public void showVehicleDetails() {
        System.out.println("Vehicle type: "+ type+ ", Number of wheels: "+numberOfWheels);
    }

    abstract void doVehicleSound();
}
