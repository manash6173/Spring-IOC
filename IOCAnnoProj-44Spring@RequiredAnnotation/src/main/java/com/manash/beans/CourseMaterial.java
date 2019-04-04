package com.manash.beans;

import org.springframework.beans.factory.annotation.Required;

public class CourseMaterial {
	
	private String bookName;
	private int pages;
	public String getBookName() {
		return bookName;
	}
	@Required
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPages() {
		return pages;
	}
	@Required
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "CourseMaterial [bookName=" + bookName + ", pages=" + pages + "]";
	}
	
}
