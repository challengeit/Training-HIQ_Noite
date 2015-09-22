package ambiguous;

abstract class AbstractBook {
	public String name;
}

interface Sleepy {
	public String name = "undefined";
}

public class Book extends AbstractBook implements Sleepy{
	public Book(String name) {
		//this.name = name;
	}
	
	public static void main(String[] args) {
		AbstractBook book = new Book("Java 7");
		System.out.println(book.name);
	}
}
