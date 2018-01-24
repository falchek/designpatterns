package command.complexremote;

public class StereoOffCommand implements Command{
	Stereo stereo; 
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo; 
	}
	
	public void execute() {
		this.stereo.off();  
	}
	
	public void undo() {
		this.stereo.on(); 
	}
}
