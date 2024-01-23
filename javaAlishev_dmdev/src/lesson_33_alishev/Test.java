package lesson_33_alishev;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ///// Java 5
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
         animals.add("cat");
         animals.add("dog");
         animals.add("frog");
         animals.add(ourAnimal);

        String animal = (String)animals.get(1);  //animals.get()-Object
        System.out.println(animal);

        ///////// С появлением Generics ///////////////

        List<String> animals2 = new ArrayList<>();
         animals2.add("cat");
         animals2.add("frog");
         animals2.add("dog");

        String animal2 = animals2.get(1);


        /////////////// Java 7 //////////////////////
        List<String> animal3 = new ArrayList<>();


    }
}
class Animal{

}