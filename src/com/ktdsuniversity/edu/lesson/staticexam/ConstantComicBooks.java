package com.ktdsuniversity.edu.lesson.staticexam;

public class ConstantComicBooks {
	
	private String bookName;
	private boolean isRented;
	// private static final int RENTALFEE;
	public static final int RENTALFEE; // 전역 변수라 public으로 써야 됨
	
	//  클래스 상수를 초기화 구역
	static {
		RENTALFEE = 1000;
	}
	
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

