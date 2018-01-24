package command.complexremote;

public class RemoteControlTest {

	public static void main (String[] args){
		ComplexRemoteControl remote = new ComplexRemoteControl(); 
		Light light = new Light(); 
		Stereo stereo = new Stereo(); 
		CeilingFan ceilingFan = new CeilingFan();  
		
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan); 
		NoCommand noCommand = new NoCommand();  
		
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo); 
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, stereoOn, stereoOff);
		remote.setCommand(2, ceilingFanHigh, noCommand);
		
		System.out.println("Remote control configuration:");
		System.out.println(remote);
		System.out.println("");
		
		
		remote.onButtonWasPressed(2);
		remote.undoButtonWasPushed();
		//remote.onButtonWasPressed(0);
		//remote.onButtonWasPressed(1);
		
		System.out.println("Setting up party mode lulz");
		Command[] partyOn = {lightOn, 
				stereoOn, 
				ceilingFanHigh};
		MacroCommand partyOnMacro = new MacroCommand(partyOn); 
		
		remote.setCommand(3, partyOnMacro, noCommand);
		remote.onButtonWasPressed(3);
		
		
		//introduce undo button
		
		//remote.onButtonWasPressed(0);
		//remote.undoButtonWasPushed();
		//remote.onButtonWasPressed(1);
		//remote.undoButtonWasPushed();
		
		/*System.out.println("Rock out for a bit");
		remote.offButtonWasPressed(0);
		System.out.println("Rock out in the dark I guess");
		remote.offButtonWasPressed(1);
		System.out.println("Sit in the quiet");
		remote.onButtonWasPressed(0);
		System.out.println("fall asleep with the lights on");
		*/
	}
	
}
