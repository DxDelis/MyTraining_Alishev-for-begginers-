package lesson_35_alishev;

interface AbleToEat{
    public void eat();
    }

public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("someone is eating..");
            }
        };
        ableToEat.eat();
    }
}
