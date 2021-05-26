package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int grade = sc.nextInt();
		
		if (grade >= 90) {
			System.out.println("A등급");
		} else if (grade >= 80) {                  // (90>grade && grade>=80) 으로도 사용
			System.out.println("B등급");           // (80>grade && grade>=70) 
		} else if (grade >= 70) {                  // (70>grade && grade>=60) 
			System.out.println("C등급");           // (60>grade)
		} else if (grade >= 60) {	
			System.out.println("D등급");
		} else {
			System.out.println("F등급입니다. 재수강을 하셔야 합니다.");
		}
		
		
	}

}
