package com.ktdsuniversity.edu.lesson.staticexam;

public class ConstantComicBooks {
	
	private String bookName;
	private boolean isRented;
	private static final int RENTALFEE = 1000;
	
	public ConstantComicBooks(String bookName, boolean isRented) {
		this.bookName = bookName;
		this.isRented = isRented;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public boolean getIsRented() {
		return isRented;
	}
	
	public int getRentalFee() {
		return RENTALFEE;
	}
	
	public void changeRent() {
		this.isRented = true;
	}
	
	public void changeReturn() {
		this.isRented = false;
	}
}

