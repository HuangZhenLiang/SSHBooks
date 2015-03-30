package org.jackson.books.service.impl;

import java.util.List;

import org.jackson.books.dao.BookDao;
import org.jackson.books.domain.Book;
import org.jackson.books.service.BookManager;

public class BookManagerImpl implements BookManager {
	private BookDao bookDao;
	public BookDao getBookDao() {
		return bookDao;
	}
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return bookDao.findAll(Book.class);
	}

}
