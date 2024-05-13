package lesson25.classwork;

public class Dog extends Pet implements Voiceable,Petable,Walkable {

    public Dog(String name, int age){

        super(name, age);
        }
        @Override
        public void voice () {
            System.out.println("bark!");
        }

    @Override
    public void pet() {
        System.out.println("You pet your dog.");
    }

    @Override
    public void feed() {
        System.out.println("You feed your dog.");

    }

    @Override
    public void cleanUp() {
        System.out.println("(You clean up dog mess)");
    }

    @Override
    public void goForAWalk() {
        System.out.println("You go for a walk.");
    }
}