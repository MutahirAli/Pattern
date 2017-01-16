package comsats.sc.lab;

public class Light implements Receiver {

	@Override
	public void switchOn() {
		System.out.println("turning lights on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("turning lights off");			
	}

	

}
