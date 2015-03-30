package org.jackson.books.service;
import java.util.List;

import org.jackson.books.domain.Book;
public interface BookManager {
	List<Book> findAllBooks();
}
