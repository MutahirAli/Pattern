package ciit.assignement3;

public class SwitchOn implements Command {
	
	RemoteControl rc;
	
	public SwitchOn(RemoteControl rc1){
		this.rc=rc1;
	}
	

	@Override
	public void execute() {
		rc.switchOn();
	
	}

}
