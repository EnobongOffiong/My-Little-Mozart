package library.management;

public class Library {

	private Book[] books = new Book[5];
	private int count = 0;
	
	public boolean addBook(Book book) {
		if(count >= 5) {
			System.out.println("There is no more space for to add new books");
			return false;
		}
		
		System.out.println("Adding books...");
		
		books[count] = book;
		count++;
		
		System.out.println("Books added successfully!");
		
		return true;
	}
//	Adds a book to the array
//	(if there is space).
	
	public boolean removeBook(Book book) {
		if(count == 0) {
			System.out.println("There are no books in your Library");
			return false;
		}
		
		for(int i = 0; i < count; i++) {
			if(books[i].getISBN().equals(book.getISBN())) {
				System.out.println("Removing book: " + book.getTitle());
				
				for (int j = i; j < count - 1; j++) {
	                books[j] = books[j + 1];  
	            }
				
				books[count-1]=null;
				count--;
				return true;
			}
		}
		
		
		System.out.println("Cannot remove book: " + book.getTitle() + ", book does not exist");
		return false;
	}
//	- Removes a book from
//	the array (if it exists).
	
	public Book searchByISBN(String ISBN) {
		for(int i = 0 ; i < count; i++) {
			if(books[i] != null) {
			if(books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		}
		System.out.println("Could not find any book with matching ISBN");
		return null;
	}
//	- Searches for a book by
//	ISBN and returns the Book object (or null if not found).
//	
	public void displayBooks() {
		if(count == 0) {
			System.out.println("There are no books in your Library");
			return ;
		}
		
		System.out.println("All books in library:");
		for(int i = 0; i < count; i++) {
			System.out.println(i+1 + ". " + books[i]);
		}
	}
}
//	- Prints details of all books using
//	toString()
//}
