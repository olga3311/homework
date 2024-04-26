package consultation10.enum01;

public enum Season {
    WINTER("Winter",-5),

    SPRING("Spring",8),

    SUMMER("Summer",22),

    AUTUMN("Autumn",10);

    private final String name;
    private final int avgTemperature;

    Season(String name, int avgTemperature) {
        this.name = name;
        this.avgTemperature = avgTemperature;
    }

    public String getName() {
        return name;
    }

    public int getAvgTemperature() {
        return avgTemperature;
    }


}
