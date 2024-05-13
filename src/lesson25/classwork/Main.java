package lesson25.classwork;

public class Main {
    public static void main(String[] args) {


        Dog pet1 = new Dog("Richard", 4);
        Cat pet2 = new Cat("Vasya", 3);

        pet1.voice();
        pet2.voice();

        pet1.feed();
        pet1.goForAWalk();


    }
}
