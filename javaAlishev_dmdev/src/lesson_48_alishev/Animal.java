package lesson_48_alishev;

public enum Animal {
    Dog("собака"), Cat("кошка"), Frog("лягушка");


    private String translation;

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык " + translation;
    }
}
