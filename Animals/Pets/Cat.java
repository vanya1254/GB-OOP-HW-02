package Animals.Pets;

public class Cat extends Pet implements Wool {

    private boolean wool;

    public Cat(Double height, Double weight, String eyeColor, String name, String breed, Boolean vaccine, String color,
            String dateOfBirth) {
        super(height, weight, eyeColor, name, breed, vaccine, color, dateOfBirth);
    }

    @Override
    public void showAffection() {
        System.out.println("Purr, purr i`m going to lie here\n");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow, meow\n");
    }

    @Override
    public void info() {
        System.out.printf(
                "\nCat:\nheight: %2.1f, weight: %2.1f, eyeColor: %s, name: %s, breed: %s, vaccine: %b, color: %s, dateOfBirth: %s\n",
                height, weight, eyeColor, name, breed, vaccine, color, dateOfBirth);
    }
 
    @Override
    public void presenceOfWool() {
        if (wool)
            System.out.println("\nI have wool!\n");
        else
            System.out.println("\nI am bald...\n");
    }

    @Override
    public String toString() {
        return String.format(
                "Cat -> height: %2.1f, weight: %2.1f, eyeColor: %s, name: %s, breed: %s, vaccine: %b, color: %s, dateOfBirth: %s",
                height, weight, eyeColor, name, breed, vaccine, color, dateOfBirth);
    }
}