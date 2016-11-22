package comsats.sc;

public class ActionOpen implements ActionListenerCommand {
    Document adoc;
    
    public ActionOpen(Document d){
    	this.adoc=d;
    }
    
    
	@Override
	public void execute() {
	    
		adoc.open();
		
	}
	

}
