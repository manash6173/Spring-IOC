package com.manash.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("jMaterial")
public class JavaMaterial implements CourseMaterial{
	@Value("java")
	private String bookName;
	@Value("369")
	private int pages;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "CourseMaterial [bookName=" + bookName + ", pages=" + pages + "]";
	}
	
}
