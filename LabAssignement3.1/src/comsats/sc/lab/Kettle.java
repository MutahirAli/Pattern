package comsats.sc.lab;

public class Kettle  implements Receiver{
	@Override
	public void switchOn() {
		System.out.println("turning Kettle on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("turning Kettle off");			
	}

}
