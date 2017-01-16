package comsats.sc.lab;
public class Oven implements Receiver {
	@Override
	public void switchOn() {
		System.out.println("turning Oven on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("turning Oven off");			
	}

}
