package consultation09;

public class Car {
    private  String model;
    private  int power;
    static int countCar;

    public Car(String model, int power){
        this.model = model;
        this.power = power;
    }

    private String getModel(){
        return model;
    }
    public int settPower(String model){
        this.model = model;
    }

}
