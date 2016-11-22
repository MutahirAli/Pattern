package comsats.sc;

public class TestChainOfResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file= null;
        Handler textHandler= new TextFileHandler("TextHandler");
        Handler docHandler= new DocFileHandler("DocHandler");
        Handler excelHandler= new ExcelFileHandler("excelHandler");
        
        textHandler.setHandler(docHandler);
        docHandler.setHandler(excelHandler);
        
        file= new File("abc.excel", "excel", "C:");
        textHandler.process(file);
        
        System.out.println("----------------------------------------------");
        
        file= new File("abc.text", " ", "C:");
        textHandler.process(file);
        
        
	}

}
