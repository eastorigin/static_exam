package com.ktdsuniversity.edu.lesson.staticexam;

public class Mart {

	public static void main(String[] args) {
		FruitSeller fs = new FruitSeller(5000, 10);
		System.out.println("오늘 과일 가격: " + FruitSeller.FRUIT_PRICE);
		System.out.println(fs.getMoney()); // 5000
		System.out.println(fs.getFruitStock()); // 10
		
		fs.sell(5);
		System.out.println(fs.getMoney()); // 기존 5000 + 5개 * 5000 = 30000
		System.out.println(fs.getFruitStock()); // 재고 5개 감소: 5
		
		fs.sell();
		System.out.println(fs.getMoney()); // 추가로 한 개 더 팜: 35000
		System.out.println(fs.getFruitStock()); // 재고 1개 감소: 4
		
		FruitSeller fs2 = new FruitSeller();
		System.out.println("오늘 과일 가격: " + FruitSeller.FRUIT_PRICE);
		System.out.println(fs2.getMoney()); // 10000
		System.out.println(fs2.getFruitStock()); // 4
		
		fs2.sell(3);
		System.out.println(fs2.getMoney()); // 기존 10000 + 3개 * 5000 = 25000
		System.out.println(fs2.getFruitStock()); // 재고 3개 감소: 4 - 3 = 1
		
		fs2.sell();
		System.out.println(fs2.getMoney()); // 추가로 한 개 더 팜: 30000
		System.out.println(fs2.getFruitStock()); // 재고 1개 감소: 1 - 1 = 0
	}
}
