package lesson_32_alishev;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog dog = (Dog)a;
        dog.bark();

    }
}


//        Dog dog = new Dog();
//        //Upcasting -восходящее преобразование
//        Animal animal = dog;
//
//        //Downcasting -Нисходящее преобразование
//        Dog dog2 = (Dog)animal;
//        dog2.bark();