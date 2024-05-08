package lesson24.homework22;

public class TV {

    private  int frequency;
    private  int currentChannel;

    public TV (int frequency) {
        this.frequency = frequency;
        currentChannel = 1;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void channelForward(){
        currentChannel++;
    }

    public void channelBackward(){
        if (currentChannel > 1){
        currentChannel --;
        }
    }

    public void setCurrentChannel(int CurrentChannel){
        if(CurrentChannel > 0) {
            this.currentChannel = currentChannel;
        }
    }
}
