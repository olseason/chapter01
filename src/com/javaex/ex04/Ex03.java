package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("단: ");
		dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			int result = dan*i;
			System.out.println(dan + "*" + i + "=" + result );
		}
		
		
		
		sc.close();
	}

}
