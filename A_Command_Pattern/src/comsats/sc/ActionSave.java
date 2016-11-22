package comsats.sc;

public class ActionSave implements ActionListenerCommand {
	     Document adoc;
	    
	    public ActionSave(Document d){
	    	this.adoc=d;
	    }
	    
	    
		@Override
		public void execute() {
		    
			adoc.save();
			
		}

}
