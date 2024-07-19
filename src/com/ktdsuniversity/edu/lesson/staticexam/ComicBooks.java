package com.ktdsuniversity.edu.lesson.staticexam;

public class ComicBooks {
	
	private String bookName;
	private boolean isRented;
	private int rent;
	
	public ComicBooks(String bookName, boolean isRented, int rent) {
		this.bookName = bookName;
		this.isRented = isRented;
		this.rent = rent;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public boolean getIsRented() {
		return isRented;
	}
	
	public int getRent() {
		return rent;
	}

}
