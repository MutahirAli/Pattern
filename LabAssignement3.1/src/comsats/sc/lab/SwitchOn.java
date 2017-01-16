package comsats.sc.lab;

public class SwitchOn implements RemoteControl {
	
	Receiver receiver;
	
	public SwitchOn(Receiver receiver){
		this.receiver=receiver;
	}
	

	@Override
	public void execute() {
		this.receiver.switchOn();
	
	}

}
