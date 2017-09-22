package cz.adastra.oop.animals;

import java.util.ArrayList;
import java.util.List;

public class InterfaceUsage {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Chicken());
        animals.add(new Chicken());
        animals.add(new Cat());
        animals.add(new Dog());

        animals.stream().forEach(
                animal -> System.out.println(animal.sound())
        );
    }
}
