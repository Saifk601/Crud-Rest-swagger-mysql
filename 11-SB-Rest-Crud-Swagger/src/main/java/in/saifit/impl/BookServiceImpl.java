package in.saifit.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import in.saifit.entity.Book;
import in.saifit.repository.BookRepository;
import in.saifit.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public String upsertBook(Book book) {
        Integer bookId = book.getBookId();
	     repository.save(book);
		
		if(bookId == null) {
			return "record inserted";
		}else {
			return "record updated";
		}
		
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> all = repository.findAll();
		return all;
	}

	@Override
	public String dltBook(Integer bookId) {
		repository.deleteById(bookId);
		return "record deleted";
	}

}
