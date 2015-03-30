package org.jackson.books.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="book_inf")
public class Book implements Serializable{
	private static final long serialVersionUID=48L;
	@Id @Column(name="book_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="book_name", length=50)
	private String name;
	@Column(name="book_author", length=50)
	private String author;
	@Column(name="book_detail", length=256)
	private String detail;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
