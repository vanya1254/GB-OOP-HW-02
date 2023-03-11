package Animals.Birds;

public class Aist extends Bird {

    public Aist(Double height, Double weight, String eyeColor, Double flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public void flight() {
        System.out.printf("\nЯ лечу на %2.1f метрах\n", flightAltitude);
    }

    @Override
    public void makeSound() {
        System.out.println("Honk, honk\n");
    }

    @Override
    public void info() {
        System.out.printf(
                "\nAist:\nheight: %2.1f, weight: %2.1f, eyeColor: %s, flightAltitude: %2.1f\n",
                height, weight, eyeColor, flightAltitude);
    }

    @Override
    public String toString() {
        return String.format(
                "Aist -> height: %2.1f, weight: %2.1f, eyeColor: %s, flightAltitude: %2.1f",
                height, weight, eyeColor, flightAltitude);
    }
}