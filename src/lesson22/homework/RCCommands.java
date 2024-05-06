package lesson22.homework;

public enum RCCommands {
    CHANNEL_UP,
    CHANNEL_DOWN,
    CHANNEL_SET;


    private  double frequency;
    private int value;

    public int getValue() {
        return value;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }



}
