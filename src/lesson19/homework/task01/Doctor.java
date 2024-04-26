package lesson19.homework.task01;

public class Doctor {
    String name;
    String specialisation;
   private int age;
   private String address;



    public Doctor(String name, String specialization, int age) {
        this.name = name;
        this.specialisation = specialization;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    String whoAmI() {
        return "Hello! I am doctor " + this.name + ", my specialization is "
                + this.specialisation + ", i'm " + this.age + " years old.";
    }
    public  void sayAge(){
        System.out.println( "I'm " + this.age + " years old.");
    }

    public void ask() {
        System.out.println("How are you feeling today? Do you have any complaints? ");
    }

    public void recommend() {
        System.out.println("Eat healthy food and have more rest!");
    }
}
