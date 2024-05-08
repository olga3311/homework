package lesson23.homework;

public class Person {
    private String name;

    public  void  introduce(){
        System.out.println("Hi! I'm " + name + ".");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
