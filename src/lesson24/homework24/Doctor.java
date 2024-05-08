package lesson24.homework24;

import java.util.Objects;

public class Doctor {
    String name;
    String specialisation;
    private int age;
    private String address;


    public Doctor(String name, String specialization, int age, String address) {
        this.name = name;
        this.specialisation = specialization;
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String whoAmI() {
        return "Hello! I am doctor " + this.name + ", my specialization is "
                + this.specialisation + ", i'm " + this.age + " years old.";
    }

    public void sayAge() {
        System.out.println("I'm " + this.age + " years old.");
    }

    public void ask() {
        System.out.println("How are you feeling today? Do you have any complaints? ");
    }

    public void recommend() {
        System.out.println("Eat healthy food and have more rest!");
    }

    @Override
    public String toString() {
        return "name: " + this.name
                + ", specialisation: " + this.specialisation
                + ", age: " + this.age
                + ", address: " + this.address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specialisation, age, address);
    }

    @Override
    public boolean equals( Object a) {
        if (this == a) {
            return true;
        }
        if (a instanceof Doctor){
            Doctor b = (Doctor) a;
            return b.name.equals(this.name)
                    && b.specialisation.equals(this.specialisation)
                    && b.age == this.age
                    && b.address.equals(this.address) ;
        }
        return false;
}



}
