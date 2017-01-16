package comsats.sc.lab;

public class Invoker {
   
	RemoteControl remote;
	
	public Invoker(RemoteControl remote){
		this.remote=remote;
	}
	
	public void execute(){
		this.remote.execute();
	}
}
