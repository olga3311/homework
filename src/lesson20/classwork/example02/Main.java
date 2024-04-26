package lesson20.classwork.example02;

public class Main {
    public static void main(String[] args) {
        TrafficLightColor color = TrafficLightColor.YELLOW;

        TrafficLightColor[] colors = TrafficLightColor.values();
        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);}
    }

}
