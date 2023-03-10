package Animals.WildAnimals;

public class Tiger extends WildAnimal {

    public Tiger(Double height, Double weight, String eyeColor, String habitat, String dateOfLocation) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
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
