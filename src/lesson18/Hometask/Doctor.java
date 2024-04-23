package lesson18.Hometask;

public class Doctor {
    String nameSurname;
    String specialisation;
    int age;
    boolean goodDoc;


    public Doctor(String nameSurname, String specialization, int age) {
        this.nameSurname = nameSurname;
        this.specialisation = specialization;
        this.age = age;

    }

    String whoAmI() {
        return "Hello! I am doctor " + this.nameSurname + ", my specialization is "
                + this.specialisation + ", i'm " + this.age + " years old.";
    }

    public void ask() {
        System.out.println("How are you feeling today? Do you have any complaints? ");
    }

    public void recommend() {
        System.out.println("Take some pills.");
    }
}