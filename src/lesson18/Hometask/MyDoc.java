package lesson18.Hometask;

public class MyDoc {
    public static void main(String[] args) {
        Doctor doctor = new Doctor( "Ivan Petrov", "general practice", 50);
        String info = doctor. whoAmI();
        System.out.println(info);

        doctor.ask();
    }
}
