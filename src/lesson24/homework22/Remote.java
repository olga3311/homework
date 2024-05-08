package lesson24.homework22;

public class Remote {
    private int frequency;

    public Remote(int frequency) {
        this.frequency = frequency;

    }

    public int getFrequency() {
        return frequency;
    }

    public  void  channelForward( TV tv) {
        if(frequency == tv.getFrequency()){
            tv.channelForward();
        }
    }
    public  void  channelChannel( TV tv){
        if(frequency ==tv.getFrequency()){
            tv.channelBackward();
        }
    }
    public  void switchChannel( TV tv, int channelNumber){
        if(frequency == tv.getFrequency()){
            tv.setCurrentChannel( channelNumber);
        }
    }
}
