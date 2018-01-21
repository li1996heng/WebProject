package com.hgzy.entity;

/**
 * LibraryTab entity. @author MyEclipse Persistence Tools
 */

public class LibraryTab implements java.io.Serializable {

	// Fields

	private Integer bookId;
	private String bookClass;
	private String bookName;
	private String author;
	private String press;
	private String hava;

	// Constructors

	/** default constructor */
	public LibraryTab() {
	}

	/** minimal constructor */
	public LibraryTab(String bookClass, String bookName, String author,
			String press) {
		this.bookClass = bookClass;
		this.bookName = bookName;
		this.author = author;
		this.press = press;
	}

	/** full constructor */
	public LibraryTab(String bookClass, String bookName, String author,
			String press, String hava) {
		this.bookClass = bookClass;
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.hava = hava;
	}

	// Property accessors

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookClass() {
		return this.bookClass;
	}

	public void setBookClass(String bookClass) {
		this.bookClass = bookClass;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return this.press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public String getHava() {
		return this.hava;
	}

	public void setHava(String hava) {
		this.hava = hava;
	}

}