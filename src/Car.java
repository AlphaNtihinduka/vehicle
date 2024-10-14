public class Car extends Vehicle{
    int numberOfDoors;
    double carPrice;

    public Car(int numberOfWheels, int numberOfDoors, double carPrice) {
        super("Car", numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }
    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Number of doors: "+numberOfDoors+
                            "Price of car"+carPrice);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Car sound: Vroom, vroom");
    }
}
