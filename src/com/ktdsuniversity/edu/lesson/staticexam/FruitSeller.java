package com.ktdsuniversity.edu.lesson.staticexam;

public class FruitSeller {

	private int money;
	
	// Duplicate field FruitSeller.money
	// private int money;
	
//	public int getMoney() {
//		return 0;
//	}
	
	// Duplicate method getMoney() in type FruitSeller
	public int getMoney() {
		return this.money;
	}
	
	private int fruitStock;
	public static final int FRUIT_PRICE = 5000;
	
	public void sell (int quantity) {
		if (this.fruitStock >= quantity) {
			this.fruitStock -= quantity;
			this.money += quantity * FruitSeller.FRUIT_PRICE;
		}
	}
	
	public void sell() {
		if(this.fruitStock >= 1) {
			this.fruitStock --;
			this.money += FruitSeller.FRUIT_PRICE;
		}
	}
	
	public FruitSeller(int money, int fruitStock) {
		this.money = money;
		this.fruitStock = fruitStock;
	}
	
	public int getFruitStock() {
		return this.fruitStock;
	}
	
	public FruitSeller() {
		this.money = 10000;
		this.fruitStock = 4;
	}
}
