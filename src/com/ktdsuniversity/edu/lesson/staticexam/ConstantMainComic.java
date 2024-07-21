package com.ktdsuniversity.edu.lesson.staticexam;

public class ConstantMainComic {

	public static void main (String[] args) {
		ConstantComicBooks pokeMon1 = new ConstantComicBooks("포켓몬스터 1권", false);
		ConstantComicBooks pokeMon2 = new ConstantComicBooks("포켓몬스터 2권", false);
		ConstantComicBooks pokeMon3 = new ConstantComicBooks("포켓몬스터 3권", false);
		ConstantComicBooks pokeMon4 = new ConstantComicBooks("포켓몬스터 4권", false);
		
		ConstantComicCafe ConstantComicCafe =new ConstantComicCafe(pokeMon1, pokeMon2, pokeMon3, pokeMon4, 0);
		
		ConstantComicCafe.printConstantComicBooks();
		System.out.println("");
		
		ConstantComicCafe.rentConstantComicBooks(pokeMon1, "포켓몬스터 1권");
		System.out.println("");
		
		ConstantComicCafe.printConstantComicBooks();
		System.out.println("");
		
		ConstantComicCafe.rentConstantComicBooks(pokeMon1, "포켓몬스터 1권");
		System.out.println("");
		
		System.out.println("소지금: " + ConstantComicCafe.getMoney());
		System.out.println("");
		
		ConstantComicCafe.returnConstantComicBooks(pokeMon1, "포켓몬스터 1권");
		System.out.println("");
		
		ConstantComicCafe.returnConstantComicBooks(pokeMon2, "포켓몬스터 2권");
		System.out.println("");
		
		ConstantComicCafe.printConstantComicBooks();
		System.out.println("--------------------------------");
		
	}
}
