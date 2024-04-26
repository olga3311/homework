package lesson19.classwork;

public class MainCar {
    public static void main(String[] args) {
        Car polo = new Car(45, 6);
        polo.refuel(10);

        System.out.println(polo.fuelVolume);

        if (polo.go(5)) {
            System.out.println("Успешная поездка");
        } else {
            System.out.println("Что-то пошло не так…");
        }

        System.out.println(polo.fuelVolume);

    }


}
