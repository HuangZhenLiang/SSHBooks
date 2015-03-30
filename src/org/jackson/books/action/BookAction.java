package org.jackson.books.action;

import java.util.ArrayList;
import java.util.List;

import org.jackson.books.domain.Book;
import org.jackson.books.service.BookManager;
import org.jackson.books.vo.BookBean;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {

	private BookManager mgr;
	private List<BookBean> books=new ArrayList<BookBean>();
	public List<BookBean> getBooks() {
		return books;
	}

	public void setBooks(List<BookBean> books) {
		this.books = books;
	}

	public BookManager getMgr() {
		return mgr;
	}

	public void setMgr(BookManager mgr) {
		this.mgr = mgr;
	}
	
	public String execute(){
		List<Book> list=mgr.findAllBooks();
		for(Book book:list){
			BookBean bean=new BookBean();
			bean.setName(book.getName());
			bean.setAuthor(book.getAuthor());
			bean.setDetail(book.getDetail());
			books.add(bean);
		}
		return SUCCESS;
	}
}
