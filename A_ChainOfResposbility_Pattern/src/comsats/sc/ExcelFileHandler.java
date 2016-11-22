package comsats.sc;

public class ExcelFileHandler implements Handler {
	private Handler handler;
	private String handlerName;

	public ExcelFileHandler( String handlerName) {
		
		this.handlerName = handlerName;
	}

	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;

	}

	@Override
	public void process(File file) {
		if (file.getFileType().equals("excel")) {
			System.out.println("Process and Saving Excel file.... by " + handlerName);
		}
		else if(handler!= null){
			System.out.println(handlerName+"forward request to "+ handler.getHandlerName());
			handler.process(file);
		}
		else{
			System.out.println("File Not Supported");
		}
		
	
	}
	@Override
	public String getHandlerName() {

		return handlerName;
	}
}
