package comsats.sc;

public class BookRepository implements Container{
	 public String books[] = {"intro to java" , "calculus1" ,"intro to programming" , "islamicstudies"};

	   @Override
	   public Iterator getIterator() {
	      return new BookIterator();
	   }

	   private class BookIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < books.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return books[index++];
	         }
	         return null;
	      }		
	   }
}
