package ciit.assignement3;

public class Juicer implements RemoteControl{
	@Override
	public void switchOn() {
		System.out.println("turning Juicer on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("turning Juicer off");			
	}

}
