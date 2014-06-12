package chapter6;

public class RemoteLoader {

	public static void main(String... args) {
		RemoteControl  remoteControl  =  new RemoteControl();
		
		Light	livingRoomLight  =  new Light("Living Room");
		Light	kitchenLight	 =  new Light("Kitchen Room");
		GarageDoor	garageDoor   =  new GarageDoor();
		
		remoteControl.setCommand(0, 
				new LightOnCommand(livingRoomLight), 
				new LightOffCommand(livingRoomLight));
		
		remoteControl.setCommand(1,
				new LightOnCommand(kitchenLight),
				new LightOffCommand(kitchenLight));
		
		remoteControl.setCommand(2, 
				new GarageDoorOpenCommand(garageDoor),
				new GarageDoorCloseCommand(garageDoor));
		
		remoteControl.triggerOnCommand(0);
		remoteControl.triggerOffCommand(0);
		
	}
	
}
