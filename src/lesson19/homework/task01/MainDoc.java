package lesson19.homework.task01;

import lesson19.homework.task01.Doctor;

public class MainDoc {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("House", "pediatrics",42);
        String info = doctor.whoAmI();
        System.out.println(info);
        doctor.setAge(32);
        doctor.sayAge();
        doctor.ask();



    }
}
