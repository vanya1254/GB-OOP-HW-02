package Animals.WildAnimals;

public class Tiger extends WildAnimal {

    public Tiger(Double height, Double weight, String eyeColor, String habitat, String dateOfLocation) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar, roar\n");
    }

    @Override
    public void info() {
        System.out.printf(
                "\nTiger:\nheight: %2.1f, weight: %2.1f, eyeColor: %s, habitat: %s, dateOfLocation: %s\n",
                height, weight, eyeColor, habitat, dateOfLocation);
    }

    @Override
    public String toString() {
        return String.format(
                "Tiger -> height: %2.1f, weight: %2.1f, eyeColor: %s, habitat: %s, dateOfLocation: %s",
                height, weight, eyeColor, habitat, dateOfLocation);
    }
}