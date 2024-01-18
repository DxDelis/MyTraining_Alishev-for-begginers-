package lesson_34_alishev;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);


    }

    private static void test (List<? extends Animal> list){ //?- могу передать List любых объектов
        for(Animal animal : list){
            animal.eat();
        }
    }
}
