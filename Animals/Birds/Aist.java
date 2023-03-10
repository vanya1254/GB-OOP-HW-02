package Animals.Birds;

public class Aist extends Bird {

    public Aist(Double height, Double weight, String eyeColor, Double flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public void flight(Double flightAltitude) {
        System.out.printf("Я лечу на %2.1f метрах", flightAltitude);
    }

    @Override
    public void makeSound() {
        System.out.println("");
    }

    @Override
    public void info() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return String.format(
                "Aist -> height: %2.1f, weight: %2.1f, eyeColor: %s, flightAltitude: %s",
                height, weight, eyeColor, flightAltitude);
    }
}