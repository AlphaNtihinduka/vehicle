//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 4, 5000);
        Boat boat = new Boat(200, 1000);

        System.out.println("Car details");
        boat.getBoatWeightAndSpeed();
    }
}