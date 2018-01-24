package command.complexremote;

public class Stereo {

	public void on(){
		System.out.println("Turned Stereo On!");
	}
	
	public void off() {
		System.out.println("Turned Stereo Off!");
	}
	public void setCD(){
		System.out.println("Setting to Spinal Tap");
	}
	public void setVolume(int level){
		System.out.println("Setting Volume to " + Integer.toString(level) +"!!");
	}
	
}
