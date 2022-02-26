package com.exercise.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class BookBean {
	@NotEmpty(message="book code must be filled.")
	private String bookCode;
	@NotEmpty 
	@Size(min=5,max=20, message="word character must be between 5 and 20")
	private String bookTitle;
	@NotBlank
	private String bookAuthor;
	@NotBlank
	@Min(value=1000, message="Minimum value is 1000$.")
	private String bookPrice;

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
}
