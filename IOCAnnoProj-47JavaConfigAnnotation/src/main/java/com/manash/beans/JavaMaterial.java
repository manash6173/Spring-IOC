package com.manash.beans;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;


@Named("jm")
//@Primary
public class JavaMaterial implements CourseMaterial{
	@Inject
	@Value("${jbookName}")
	private String bookName;
	@Inject
	@Value("${jpages}")
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
