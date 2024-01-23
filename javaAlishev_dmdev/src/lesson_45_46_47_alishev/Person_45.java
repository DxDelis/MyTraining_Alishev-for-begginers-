package lesson_45_46_47_alishev;


import java.io.Serial;
import java.io.Serializable;

public class Person_45 implements Serializable {
    @Serial
    private static final long serialVersionUID = -4601906167002577709L;

    private  int id;
    private String personName;
    private int age;
    private byte type;
    

    public Person_45(int id, String name){
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }
    public String toString(){
        return  id + " : " + personName;
    }
}
