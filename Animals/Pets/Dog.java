package Animals.Pets;

public class Dog extends Pet {

    public Dog(Double height, Double weight, String eyeColor, String name, String breed, Boolean vaccine, String color,
            String dateOfBirth) {
        super(height, weight, eyeColor, name, breed, vaccine, color, dateOfBirth);
    }

    @Override
    public void showAffection() {
        System.out.println("");
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