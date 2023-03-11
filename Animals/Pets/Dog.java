package Animals.Pets;

public class Dog extends Pet implements Training {
    private boolean training;

    public Dog(Double height, Double weight, String eyeColor, String name, String breed, Boolean vaccine, String color,
            String dateOfBirth, boolean training) {
        super(height, weight, eyeColor, name, breed, vaccine, color, dateOfBirth);
        this.training = training;
    }

    @Override
    public void showAffection() {
        System.out.println("Don`t touch me!\n");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof, woof\n");
    }

    @Override
    public void info() {
        System.out.printf(
                "\nDog:\nheight: %2.1f, weight: %2.1f, eyeColor: %s, name: %s, breed: %s, vaccine: %b, color: %s, dateOfBirth: %s\n",
                height, weight, eyeColor, name, breed, vaccine, color, dateOfBirth);
    }

    @Override
    public void training() {
        if (training) System.out.println("\nI`m trained!\n");
        else System.out.println("\nI`m not trained!\n");
    }

    @Override
    public String toString() {
        return String.format(
                "Dog -> height: %2.1f, weight: %2.1f, eyeColor: %s, name: %s, breed: %s, vaccine: %b, color: %s, dateOfBirth: %s",
                height, weight, eyeColor, name, breed, vaccine, color, dateOfBirth);
    }
}