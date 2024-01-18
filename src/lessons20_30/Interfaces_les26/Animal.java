package lessons20_30.Interfaces_les26;

public class Animal implements Info{
    public int id;
    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("i'm sleeping");

    }
    @Override
    public void showInfo(){
        System.out.println("Id is "+ this.id);
    }
}
