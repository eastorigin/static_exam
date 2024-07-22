package com.ktdsuniversity.edu.lesson.staticexam;

public class PracticeClassMethod {

	// 문제 1
	public static boolean isValidAge(int age, int min, int max) {
//		if(age > min && age < max) {
//			return true;
//		}else {
//			return false;
//		}
		return age > min && age < max;
	}
	
	// 문제 2
	public static double getCourseCredit(double average) {
		if(average >= 95) {
			return 4.5;
		}else if(average >= 90) {
			return 4.0;
		}else if(average >= 80) {
			return 3.5;
		}else if(average >= 75) {
			return 3.0;
		}else if(average >= 65) {
			return 2.5;
		}else if(average >= 60) {
			return 2.0;
		}else if(average >=50) {
			return 1.5;
		}else if(average >=45) {
			return 1.0;
		}else {
			return 0.0;
		}
	}
	
	// 문제 3
	public static String getABCDE(double courseCredit) {
		if(courseCredit == 4.5) {
			return "A+";
		}else if(courseCredit == 4.0) {
			return "A";
		}else if(courseCredit == 3.5) {
			return "B+";
		}else if(courseCredit == 3.0) {
			return "B";
		}else if(courseCredit == 2.5) {
			return "C+";
		}else if(courseCredit == 2.0) {
			return "C";
		}else if(courseCredit == 1.5) {
			return "D+";
		}else if(courseCredit == 1.0) {
			return "D";
		}else {
			return "F";
		}
	}
	
	// 문제 4
	public static double getCourseCredit2(double average) {
		if(average < 55) {
			return 0.1;
		}else {
			return (average - 55) / 10.0;
		}
	}
	
	public static String getABCDEF(double courseCredit2) {
		if(courseCredit2 >= 4.1) {
			return "A+";
		}else if(courseCredit2 >= 3.6) {
			return "A";
		}else if(courseCredit2 >= 3.1) {
			return "B+";
		}else if(courseCredit2 >= 2.6) {
			return "B";
		}else if(courseCredit2 >= 1.6) {
			return "C";
		}else if(courseCredit2 >= 0.6) {
			return "D";
		}else {
			return "F";
		}
	}
}
