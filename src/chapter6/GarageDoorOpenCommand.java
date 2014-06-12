package chapter6;

public class GarageDoorOpenCommand implements Command {

	GarageDoor		garageDoor;
	
	public GarageDoorOpenCommand (GarageDoor garageDoor) {
		this.garageDoor  =  garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.up();
	}

}
