package Animals.WildAnimals;

public class Wolf extends WildAnimal implements Leader {
    
    private boolean lead;

    public Wolf(Double height, Double weight, String eyeColor, String habitat, String dateOfLocation, boolean lead) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
        this.lead = lead;
    }

    @Override
    public void leader() {
        System.out.printf("%b", lead);
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
                "Tiger -> height: %2.1f, weight: %2.1f, eyeColor: %s, habitat: %s, dateOfLocation: %s, lead: %b",
                height, weight, eyeColor, habitat, dateOfLocation, lead);
    }
}