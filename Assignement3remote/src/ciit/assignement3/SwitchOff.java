package ciit.assignement3;

public class SwitchOff implements Command {

	RemoteControl rc;
	
	public SwitchOff(RemoteControl rc1){
		this.rc=rc1;
	}
	

	
	public void execute() {
		rc.switchOff();
	
	}

}
