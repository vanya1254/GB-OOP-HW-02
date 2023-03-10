package Animals.Pets;

public class Cat extends Pet implements Wool {

    private boolean wool;

    public Cat(Double height, Double weight, String eyeColor, String name, String breed, Boolean vaccine, String color,
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

    @Override
    public void presenceOfWool() {
        System.out.printf("%b", wool);
    }

    @Override
    public String toString() {
        return String.format(
                "Cat -> height: %2.1f, weight: %2.1f, eyeColor: %s, name: %s, breed: %s, vaccine: %b, color: %s, dateOfBirth: %s",
                height, weight, eyeColor, name, breed, vaccine, color, dateOfBirth);
    }
}