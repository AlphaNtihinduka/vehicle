public class Boat extends Vehicle{
    double maxKnotsSpeed;
    int boatKilosWeight;

    // Create a boat constructor
    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        super("Boat", 0);
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override

    // Override the vehicle sound
    public void doVehicleSound() {
        System.out.println("Boat sound: Bubble loud acoustic sound");
    }

    // print the boat speed and weight details
    public String getBoatWeightAndSpeed() {
        return "Max knot speed: "+maxKnotsSpeed+", Boat weight: "+boatKilosWeight;
    }
}

