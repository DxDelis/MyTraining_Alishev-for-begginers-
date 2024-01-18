package lessons20_30.Interfaces_les26;

public class Test1 {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Nick");
        outputInfo(animal);
        outputInfo(person);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
