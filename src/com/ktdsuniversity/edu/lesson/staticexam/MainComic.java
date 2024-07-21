package com.ktdsuniversity.edu.lesson.staticexam;

public class MainComic {

	public static void main(String[] args) {
		ComicBooks pokeMon1 = new ComicBooks("포켓몬스터 1권", false, 600);
		ComicBooks pokeMon2 = new ComicBooks("포켓몬스터 2권", false, 700);
		ComicBooks pokeMon3 = new ComicBooks("포켓몬스터 3권", false, 800);
		ComicBooks pokeMon4 = new ComicBooks("포켓몬스터 4권", false, 1000);
		
		ComicCafe comicCafe =new ComicCafe(pokeMon1, pokeMon2, pokeMon3, pokeMon4, 0);
		
		comicCafe.printComicBooks();
		System.out.println("");
		
		comicCafe.rentComicBooks(pokeMon1, "포켓몬스터 1권");
		System.out.println("");
		
		comicCafe.printComicBooks();
		System.out.println("");
		
		comicCafe.rentComicBooks(pokeMon1, "포켓몬스터 1권");
		System.out.println("");
		
		System.out.println("소지금: " + comicCafe.getMoney());
		System.out.println("");
		
		comicCafe.returnComicBooks(pokeMon1, "포켓몬스터 1권");
		System.out.println("");
		
		comicCafe.returnComicBooks(pokeMon2, "포켓몬스터 2권");
		System.out.println("");
		
		comicCafe.printComicBooks();
		System.out.println("--------------------------------");
		
	}
}
