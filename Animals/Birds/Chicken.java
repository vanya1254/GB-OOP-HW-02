package Animals.Birds;

public class Chicken extends Bird{

    public Chicken(Double height, Double weight, String eyeColor, Double flightAltitude) {
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
}
