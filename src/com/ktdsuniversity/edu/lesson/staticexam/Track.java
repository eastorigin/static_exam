package com.ktdsuniversity.edu.lesson.staticexam;

public class Track {

	// private int number = 0;
	
	public static void main(String[] args) {
		
		// number += 1; static에서는 인스턴스 변수 접근 불가
		
		// Car matiz = new Car("경차", "마티즈");
		Car matiz = new Car(Car.SMALL, "마티즈");
		matiz.startEngine();
		
		Car kona = new Car(Car.MIDEUM, "코나");
		kona.startEngine();
		
		Car g90 = new Car(Car.LARGE, "제네시스 G90");
		g90.startEngine();
		
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isEmpty("AAA"));
		System.out.println(StringUtils.isNumber("65413514"));
		System.out.println(StringUtils.parseInt("5678974"));
	}
}
