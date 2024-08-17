package in.saifit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.saifit.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}
