package lesson20.classwork.example01;

public class Main {
    public static void main(String[] args) {


        Human mihail = new Human("Mihail", 28);
        Human olga = new Human("Olga", 28);

        System.out.println(mihail.getName());
        System.out.println(olga.getName());
        System.out.println("Species: " + mihail.species);
        olga.species = "Domestic cat";
        System.out.println("Species: " + mihail.species);
    }
}