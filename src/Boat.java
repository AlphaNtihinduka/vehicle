public class Boat extends Vehicle{
    double maxKnotsSpeed;
    int boatKilosWeight;

    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        super("Boat", 0);
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Boat sound: Bubble loud acoustic sound");
    }

    public String getBoatWeightAndSpeed() {
        return "Max knot speed: "+maxKnotsSpeed+", Boat weight: "+boatKilosWeight;
    }
}

