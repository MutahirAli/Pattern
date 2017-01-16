package comsats.sc.lab;

public class Juicer implements Receiver{
	@Override
	public void switchOn() {
		System.out.println("turning Juicer on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("turning Juicer off");			
	}

}
