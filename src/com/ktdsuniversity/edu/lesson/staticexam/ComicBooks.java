package com.ktdsuniversity.edu.lesson.staticexam;

public class ComicBooks {
	
	/**
	 * 멤버변수는 주석이 아니라 document로 설명하는게 좋다
	 */
	private String bookName;
	private boolean isRented;
	private int rentalFee;
	
	public ComicBooks(String bookName, boolean isRented, int rentalFee) {
		this.bookName = bookName;
		this.isRented = isRented;
		this.rentalFee = rentalFee;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public boolean getIsRented() {
		return isRented;
	}
	
	public int getRent() {
		return rentalFee;
	}
	
	public void changeRent() {
		this.isRented = true;
	}
	
	public void changeReturn() {
		this.isRented = false;
	}
}
