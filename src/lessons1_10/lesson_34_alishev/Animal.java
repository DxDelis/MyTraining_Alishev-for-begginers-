package lesson_34_alishev;

public class Animal {
    private int id;

    public Animal(){

    }

    public  Animal(int id){
        this.id = id;
    }

    public  void eat(){
        System.out.println("i'm eating..");
    }

    public String toString(){
        return String.valueOf(id);
    }
}
