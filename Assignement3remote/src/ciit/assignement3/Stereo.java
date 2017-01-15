package ciit.assignement3;

public class Stereo implements RemoteControl {
	@Override
	public void switchOn() {
		System.out.println("turning Stereo on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("turning Stereo off");			
	}

}
