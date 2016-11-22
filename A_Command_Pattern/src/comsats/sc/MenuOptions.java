package comsats.sc;

public class MenuOptions {
	ActionListenerCommand openCommand;
	ActionListenerCommand saveCommand;

	MenuOptions(ActionListenerCommand openCom, ActionListenerCommand saveCom) {
		this.openCommand = openCom;
		this.saveCommand = saveCom;
	}
	
	public void clickOpen(){
		openCommand.execute();
	}
	public void clickSave(){
        saveCommand.execute();		
	}

}
