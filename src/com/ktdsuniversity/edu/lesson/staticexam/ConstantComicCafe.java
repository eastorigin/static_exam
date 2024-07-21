package com.ktdsuniversity.edu.lesson.staticexam;

public class ConstantComicCafe {

	private int money;
	private ConstantComicBooks ConstantComicBooks1;
	private ConstantComicBooks ConstantComicBooks2;
	private ConstantComicBooks ConstantComicBooks3;
	private ConstantComicBooks ConstantComicBooks4;
	
	public ConstantComicCafe(ConstantComicBooks ConstantComicBooks1, ConstantComicBooks ConstantComicBooks2, ConstantComicBooks ConstantComicBooks3, ConstantComicBooks ConstantComicBooks4, int money) {
		this.ConstantComicBooks1 = ConstantComicBooks1;
		this.ConstantComicBooks2 = ConstantComicBooks2;
		this.ConstantComicBooks3 = ConstantComicBooks3;
		this.ConstantComicBooks4 = ConstantComicBooks4;
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void printComicBook(ConstantComicBooks ConstantComicBooks) {
		if (ConstantComicBooks != null) {
			if (ConstantComicBooks.getIsRented()) {
				System.out.println(ConstantComicBooks.getBookName() + ": 대여 중");
			}else {
				System.out.println(ConstantComicBooks.getBookName() + ": 대여 가능");
			}
		}else {
			System.out.println("만화책이 아직 준비되지 않았습니다.");
		}
	}
	
	public void printConstantComicBooks() {
		printComicBook(ConstantComicBooks1);
		printComicBook(ConstantComicBooks2);
		printComicBook(ConstantComicBooks3);
		printComicBook(ConstantComicBooks4);
	}
	
	public void rentConstantComicBooks(ConstantComicBooks ConstantComicBooks, String bookName) {
		if (ConstantComicBooks != null && ConstantComicBooks.getBookName().equals(bookName)) {
			if (!ConstantComicBooks.getIsRented()) {
				ConstantComicBooks.changeRent();
				this.money += ConstantComicBooks.getRentalFee();
				System.out.println(ConstantComicBooks.getBookName() + "을 대여했습니다");
			} else {
				System.out.println(ConstantComicBooks.getBookName() + "은 이미 대여 중입니다");
			}
		} else {
			System.out.println("만화책이 아직 준비되지 않았습니다.");
		}
	}
	
	public void returnConstantComicBooks(ConstantComicBooks ConstantComicBooks, String bookName) {
		if (ConstantComicBooks != null && ConstantComicBooks.getBookName().equals(bookName)) {
			if (ConstantComicBooks.getIsRented()) {
				ConstantComicBooks.changeReturn();
				System.out.println(ConstantComicBooks.getBookName() + "을 반납했습니다");
			} else {
				System.out.println("대여하지 않은 책입니다");
			}
		} else {
			System.out.println("만화책이 아직 준비되지 않았습니다.");
		}
	}
}

