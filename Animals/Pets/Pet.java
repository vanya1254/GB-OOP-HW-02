package Animals.Pets;

import Animals.Animal;

public abstract class Pet extends Animal implements Affection {
    protected String name;
    protected String breed;
    protected Boolean vaccine;
    protected String color;
    protected String dateOfBirth;

    protected Pet(Double height, Double weight, String eyeColor, String name, String breed, Boolean vaccine, String color,
            String dateOfBirth) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccine = vaccine;
        this.color = color;
        this.dateOfBirth = dateOfBirth;
    }
}