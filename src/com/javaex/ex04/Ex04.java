package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			
			//이전까지의 합 
			sum = sum + i;
			System.out.println(i + "까지의 합은 sum: " + sum);
		}
		 
		System.out.println("10회 까지의 합은" + sum);
		
		
		
		
		
		
		
		sc.close();
		
	}

}
