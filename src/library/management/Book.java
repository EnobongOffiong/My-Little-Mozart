package library.management;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price; 
	
	public Book() {
		 title = "Unknown";
		 author = "Unknown";
		 ISBN = "Unknown";
		 price = 0.0;	
		 
		 //no "this" needed because there is no parameters  
		
	}
	//parameterized constructor 
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN; 
		this.price = price; 
		
	}
	//copy constructor 
	public Book(Book copy) {
		this.title = copy.title;
		this.author = copy.author;
		this.ISBN = copy.ISBN;
		this.price = copy.price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object other) {
		Book b = (Book) other; //casting because need to access specific fields in Book class 
		if(b == null) return false;
		
		else return ISBN.equals(b.ISBN);

		}
	
	@Override
	public String toString() {
		return title + " by " + author + " (ISBN: " + ISBN + "), $" + price;
		
	}
	
	
 
	
	
}
