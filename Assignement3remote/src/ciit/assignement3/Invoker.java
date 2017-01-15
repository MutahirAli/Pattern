package ciit.assignement3;

public class Invoker {
   
	Command command;
	
	public Invoker(Command command){
		this.command=command;
	}
	
	public void execute(){
		this.command.execute();
	}
}
