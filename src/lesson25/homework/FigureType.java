package lesson25.homework;

public enum FigureType {
    CIRCLE,
    RECTANGLE,
    REGULAR_POLYGON;

    public String getDiscription (){
        return this.name().toLowerCase().replace('_',' ');
    }
}
