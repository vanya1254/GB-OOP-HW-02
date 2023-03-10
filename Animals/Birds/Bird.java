package Animals.Birds;

import Animals.Animal;

public abstract class Bird extends Animal implements Flight {
    protected Double flightAltitude;

    public Bird(Double height, Double weight, String eyeColor, Double flightAltitude) {
        super(height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }
}
