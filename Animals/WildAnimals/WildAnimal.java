package Animals.WildAnimals;

import Animals.Animal;

public abstract class WildAnimal extends Animal {
    protected String habitat;
    protected String dateOfLocation;
    
    protected WildAnimal(Double height, Double weight, String eyeColor, String habitat, String dateOfLocation) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }
}