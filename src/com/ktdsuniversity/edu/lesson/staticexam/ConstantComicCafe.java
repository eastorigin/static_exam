package com.ktdsuniversity.edu.lesson.staticexam;

public class ConstantComicCafe {

	private int money;
	private ComicBooks comicBooks1;
	private ComicBooks comicBooks2;
	private ComicBooks comicBooks3;
	private ComicBooks comicBooks4;
	
	public ConstantComicCafe(ComicBooks comicBooks1, ComicBooks comicBooks2, ComicBooks comicBooks3, ComicBooks comicBooks4, int money) {
		this.comicBooks1 = comicBooks1;
		this.comicBooks2 = comicBooks2;
		this.comicBooks3 = comicBooks3;
		this.comicBooks4 = comicBooks4;
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void printComicBook(ComicBooks comicBooks) {
		if (comicBooks != null) {
			if (comicBooks.getIsRented()) {
				System.out.println(comicBooks.getBookName() + ": 대여 중");
			}else {
				System.out.println(comicBooks.getBookName() + ": 대여 가능");
			}
		}else {
			System.out.println("만화책이 아직 준비되지 않았습니다.");
		}
	}
	
	public void printComicBooks() {
		printComicBook(comicBooks1);
		printComicBook(comicBooks2);
		printComicBook(comicBooks3);
		printComicBook(comicBooks4);
	}
	
	public void rentComicBooks(ComicBooks comicBooks, String bookName) {
		if (comicBooks != null && comicBooks.getBookName().equals(bookName)) {
			if (!comicBooks.getIsRented()) {
				comicBooks.changeRent();
				this.money += comicBooks.getRent();
				System.out.println(comicBooks.getBookName() + "을 대여했습니다");
			} else {
				System.out.println(comicBooks.getBookName() + "은 이미 대여 중입니다");
			}
		} else {
			System.out.println("만화책이 아직 준비되지 않았습니다.");
		}
	}
	
	public void returnComicBooks(ComicBooks comicBooks, String bookName) {
		if (comicBooks != null && comicBooks.getBookName().equals(bookName)) {
			if (comicBooks.getIsRented()) {
				comicBooks.changeReturn();
				System.out.println(comicBooks.getBookName() + "을 반납했습니다");
			} else {
				System.out.println("대여하지 않은 책입니다");
			}
		} else {
			System.out.println("만화책이 아직 준비되지 않았습니다.");
		}
	}
}

