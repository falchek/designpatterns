package command.complexremote;

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("No command for this button");
	}

	@Override
	public void undo() {
		System.out.println("No undo command set");
		
	}

}
