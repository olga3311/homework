package lesson18.classwork;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    String whoAmI() {
        return "I am dog " + this.name + ", my weight: " + this.weight;
    }

    void eat() {
        System.out.println("I am eating, njam-njam!");
        weight++;
    }

    void run() {

        while (weight < 3) {
            System.out.println("Сорян! Я слмшком худая и голодная! Бежать не могу! ");
            System.out.println("Надо поесть! Мой вес сейчас:" + weight);

            eat();
        }
        System.out.println("I am running!");
        weight -= 2;
    }

}
