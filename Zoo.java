import java.util.ArrayList;
import Animals.Animal;
import Animals.Birds.Aist;
import Animals.Birds.Chicken;
import Animals.Pets.Cat;
import Animals.Pets.Dog;
import Animals.WildAnimals.Tiger;
import Animals.WildAnimals.Wolf;

public class Zoo {
    protected ArrayList<Animal> zoo = new ArrayList<>();

    public Zoo() {
        this.zoo.add(new Cat(40.2, 8.2, "Green", "Barsik", "Maine Coon", true, "Brown", "10.03.22"));
        this.zoo.add(new Dog(62.5, 41.5, "Black", "Bobik", "Rottweiler", true, "Black", "15.05.22"));
        this.zoo.add(new Tiger(224.4, 256.7, "Yellow", "Russia", "10.03.23"));
        this.zoo.add(new Wolf(85.4, 60.3, "Yellow", "Canada", "09.02.23", false));
        this.zoo.add(new Aist(1.05, 4.5, "Black", 15.7));
        this.zoo.add(new Chicken(28.7, 1.230, "Red", 0.1));
    }

    void addAnimalToZoo(Animal beast) {
        zoo.add(beast);
    }

    public ArrayList<Animal> getZoo() {
        return zoo;
    }

    @Override
    public String toString() {
        return zoo.toString();
    }
}