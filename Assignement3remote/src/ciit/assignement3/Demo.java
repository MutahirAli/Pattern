package ciit.assignement3;

public class Demo {

	public static void main(String[] args) {
		
		RemoteControl r= new Stereo();
		Command on= new SwitchOn(r);
		Invoker i= new Invoker(on);
		i.execute();
		
		r= new Stereo();
		Command of= new SwitchOff(r);
	    i= new Invoker(of);
		i.execute();
		
	}

}
