package comsats.sc.lab;

public class SwitchOff implements RemoteControl {

Receiver receiver;
	
	public SwitchOff(Receiver receiver){
		this.receiver=receiver;
	}
	

	@Override
	public void execute() {
		this.receiver.switchOff();
	
	}

}
