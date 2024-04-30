package lesson22.classwork.example02;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Germany", "Berlin", "Weser.48");
        Human human1 = new Human("Niko", address);
        Human human2 = new Human("Julie", address);

        human2.introduce();
        human1.introduce();
    }
}

