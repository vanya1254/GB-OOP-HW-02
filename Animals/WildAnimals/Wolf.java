package Animals.WildAnimals;

public class Wolf extends WildAnimal implements Leader {

    private boolean lead;

    public Wolf(Double height, Double weight, String eyeColor, String habitat, String dateOfLocation, boolean lead) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
        this.lead = lead;
    }

    @Override
    public void leader() {
        if (lead)
            System.out.println("I am leader!\n");
        else
            System.out.println("I am not leader...\n");
    }

    @Override
    public void makeSound() {
        System.out.println("Whooooooo\n");
    }

    @Override
    public void info() {
        System.out.printf(
                "\nWolf:\nheight: %2.1f, weight: %2.1f, eyeColor: %s, habitat: %s, dateOfLocation: %s, lead: %b\n",
                height, weight, eyeColor, habitat, dateOfLocation, lead);
    }

    @Override
    public String toString() {
        return String.format(
                "Wolf -> height: %2.1f, weight: %2.1f, eyeColor: %s, habitat: %s, dateOfLocation: %s, lead: %b",
                height, weight, eyeColor, habitat, dateOfLocation, lead);
    }
}