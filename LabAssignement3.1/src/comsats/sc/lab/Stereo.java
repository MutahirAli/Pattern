package comsats.sc.lab;

public class Stereo implements Receiver {
	@Override
	public void switchOn() {
		System.out.println("turning Stereo on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("turning Stereo off");			
	}

}
