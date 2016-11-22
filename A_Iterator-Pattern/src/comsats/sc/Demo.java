package comsats.sc;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BookRepository booksRepository = new BookRepository();

	      for(Iterator iter = booksRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	}

}
