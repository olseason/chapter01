package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int hour = sc.nextInt();
		
		int a = 10000;
		int add = 8 * 10000 + (hour - 8) * ((int)(10000 * 1.5)); // 1.5 -> 실수를 정수로 형변환
		
		
		if (hour <=8 ) {
			System.out.println("임금은" + ( a * hour ) + "원 입니다.");
		} else {
			System.out.println("임금은" + add + "원 입니다.");
		}
		
		
		sc.close();

	}

}
