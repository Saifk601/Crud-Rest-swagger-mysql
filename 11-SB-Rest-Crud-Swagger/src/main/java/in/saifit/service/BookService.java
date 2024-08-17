package in.saifit.service;

import java.util.List;
import in.saifit.entity.Book;

public interface BookService {
	
	//this method for insert and update
	public String upsertBook(Book book);
	
	public List<Book> getAllBooks();
	
	public String dltBook(Integer bookId);

}
