package lesson22.homework;

public class RemoteControl {
   private double frequency;

   public RemoteControl(double frequency) {
      this.frequency = frequency;
   }

   public double getFrequency() {
      return frequency;
   }

   public RCCommands sendCommand( RCCommands rcCommand, int value){
      rcCommand.setFrequency( frequency);

      if(rcCommand == RCCommands.CHANNEL_SET){
         rcCommand.setValue(value);
      }

      return rcCommand;
   }





}
