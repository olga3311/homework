package lesson22.homework;

public class TV {
   private  double frequency;
    int[] channels;
    private int currentChannel;



    public TV(double frequency, int[] channels) {
        this.frequency = frequency;
        this.channels = channels;
        currentChannel = 0;
    }

    public double getFrequency() {
        return frequency;
    }

    public int[] getChannels() {
        return channels;
    }



    public void setChannels(int[] channels) {
        this.channels = channels;
    }

    public int receive( RCCommands command){

        if(command.getFrequency() != this.frequency){
          return 1;
        }

        switch (command){
            case CHANNEL_UP:
                if (currentChannel == (channels.length - 1)){
                    currentChannel = 0;
                }else  currentChannel++;
                return 0;

            case CHANNEL_DOWN:
                if ( currentChannel == 0){
                    currentChannel = (channels.length - 1);
                }else  currentChannel--;
                return 0;

            case CHANNEL_SET:
                int newChannel = command.getValue();
                if ( newChannel > 0){

                    for ( int i = 0; i< channels.length; i++)
                    {  if (channels[i] == newChannel) {
                        currentChannel = i;
                        return 0;
                    }else return 2;
                    }
                }return 3;//канал меньше ноля
        }
       return 4;
    }


    public int getCurrentChannel (){
        return  channels[currentChannel];
    }


    public void getError (int error){
        switch (error){
            case 1:
                System.out.println("Invalid frequency!");
                break;
            case 2:
                System.out.println("The channel doesn't exist!");
                break;
            case 3:
                System.out.println("A channel number cannot be negative!");
                break;
            case 4:
                System.out.println("Unknown error!");
                break;
        }
    }


}

