public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("mike");
        person1.setAge(12);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());

    }
}

class Person{
    private String name;
    private int age;

    public void setName(String Username){
        if(Username.isEmpty()){
            System.out.println("Ты ввел пустое имя!");
        } else{
        name = Username;}
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if(userAge<0){
            System.out.println("возраст должен быть положительным!");
        } else {
        age = userAge;}
    }
    public int getAge(){
        return age;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){ //void - возр. ничто
        for(int i = 0; i<3; i++)
        System.out.println("My name is " + name + ", i'm "+ age + " age");
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}



//        person1.setNameAndAge("Nick",19);
//        String s1 = "Taisia";
//        Person person2 = new Person();
//        person2.setNameAndAge(s1,15);
//        person1.speak();
//        person2.speak();
//        int year1 = person1.calculateYearsToRetirement();
//        int year2 = person2.calculateYearsToRetirement();
//        System.out.println("Первому человеку до пенсии " + year1 + " лет.");
//        System.out.println("Первому человеку до пенсии " + year2 + " лет.");