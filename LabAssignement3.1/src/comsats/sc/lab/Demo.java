package comsats.sc.lab;

public class Demo {

	public static void main(String[] args) {
		
		Receiver r= new Light();
		RemoteControl on= new SwitchOn(r);
		Invoker user= new Invoker(on);
		user.execute();
		
		r= new Oven();
		RemoteControl off= new SwitchOff(r);
	    user= new Invoker(off);
		user.execute();
		
		r= new Stereo();
		RemoteControl stereo= new SwitchOff(r);
		user=new Invoker(stereo);
		user.execute();
		
	}

}
