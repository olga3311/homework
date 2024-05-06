package lesson22.homework;

public class Main {
    public static void main(String[] args) {

        int[] myChannels = {1,2, 3, 4, 5, 22, 44, 56};
       TV newTV = new TV(25.25, myChannels);

       RemoteControl newRC = new RemoteControl(25.25);

        System.out.println( "Current channel is: " + newTV.getCurrentChannel());

        int result = newTV.receive(newRC.sendCommand(RCCommands.CHANNEL_DOWN,0));
        newTV.getError(result);
        System.out.println( "Current channel is: " + newTV.getCurrentChannel());

        result = newTV.receive(newRC.sendCommand(RCCommands.CHANNEL_SET,65));
        newTV.getError(result);

        RemoteControl newRC2 = new RemoteControl(35.25);
        result = newTV.receive(newRC2.sendCommand(RCCommands.CHANNEL_SET,65));
        newTV.getError(result);
    }
}
// тип отношения между пультом и телевизором  - агрегация
