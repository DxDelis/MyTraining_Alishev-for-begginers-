public class constructor {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 19);
        System.out.println(h1.toString());

    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + "," + age;
    }


}


//        Human h2 = new Human("Timmy", 18);
//        h1.printNumberOfPeople();
//        h2.printNumberOfPeople();
//        Human h3 = new Human("ROB", 24);
//        h1.printNumberOfPeople();
//        h2.printNumberOfPeople();
//        h3.printNumberOfPeople();

//    countPeople++;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void printNumberOfPeople(){
//        System.out.println("Number of people is: " + countPeople);
//    }