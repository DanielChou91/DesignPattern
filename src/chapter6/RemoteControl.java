package chapter6;

public class RemoteControl {

	Command[]		onCommands;
	Command[]		offCommands;
	
	public RemoteControl () {
		onCommands  =  new Command[4];
		offCommands  =  new Command[4];
		
		Command		noCommand  =  () -> {};
		for (int i=0; i != 4 ; i++ ) {
			onCommands[i]  =  noCommand;
			offCommands[i] =  noCommand;
		}
	}
	
	public void setCommand (int slot, Command onCommand, Command offCommand) {
		onCommands[slot]  =  onCommand;
		offCommands[slot]  =  offCommand;
	}
	
	public void triggerOnCommand (int slot) {
		onCommands[slot].execute();
	}
	
	public void triggerOffCommand (int slot) {
		offCommands[slot].execute();
	}
}
