package Animals;

public abstract class Animal implements InterfaceAnimal {
    protected Double height;
    protected Double weight;
    protected String eyeColor;

    public Animal(Double height, Double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }
}