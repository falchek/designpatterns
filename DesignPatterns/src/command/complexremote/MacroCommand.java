package command.complexremote;

public class MacroCommand implements Command{
	Command [] commands; 
	
	public MacroCommand(Command[] commands){
		this.commands = commands;  
	}
	
	public void execute() {
		for (int i = 0; i < commands.length; i ++)
		{
			commands[i].execute();
		}
	}
	
	public void undo() {
		System.out.println("YOU CANT STOP THIS PARTY");
	}
}
