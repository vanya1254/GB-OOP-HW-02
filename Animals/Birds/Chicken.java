package Animals.Birds;

public class Chicken extends Bird {

    public Chicken(Double height, Double weight, String eyeColor, Double flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public void flight() {
        System.out.printf("\nЯ лечу на %2.1f метрах\n", flightAltitude);
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck\n");
    }

    @Override
    public void info() {
        System.out.printf(
                "\nChicken:\nheight: %2.1f, weight: %2.1f, eyeColor: %s, flightAltitude: %2.1f\n",
                height, weight, eyeColor, flightAltitude);
    }

    @Override
    public String toString() {
        return String.format(
                "Chicken -> height: %2.1f, weight: %2.1f, eyeColor: %s, flightAltitude: %2.1f",
                height, weight, eyeColor, flightAltitude);
    }
}