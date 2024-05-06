package lesson23.classwork.example01;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Richard", 6, "Golden REtriever", 15,
                50, DogProfession.DOMESTIC);
        Cat cat = new Cat( "Vasya", 4, "Sfinks", 1.5, false);
        Pet fish = new Pet("Katie", 1, "Goldfish", 0.2);

        dog.bark();
        cat.meow();
    }
}
