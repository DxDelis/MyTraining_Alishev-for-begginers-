package lesson_42_Alishev;

public class Test {
    public static void main(String[] args) {
        String a ="hello";
        String b = "hello123".substring(0, 5);

        System.out.println(b);
        System.out.println(a == b);
    }
}
class Animal{
    private int id;

    public Animal(int id){
        this.id = id;
    }

    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}


//        String s1 = "hello";       // помещается в pool   s1 ->   {"hello"}
//        String s2 = "hello";       // помещается в pool   s2 ->   {"hello"}
//
//        System.out.println(s1.equals(s2));