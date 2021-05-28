package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		
		int dan;
		int i = 1; // 초기
		
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		dan = sc.nextInt();
		
		while (i<=9) {   //반복조
			
			System.out.println(dan + "*" + i + "=" + dan*i);
			
			i++;         //증강식 
			
		}
		sc.close();	
		  
		
		/* for 반복문 실행흐름
		 
		   for (int i =1; i <= 9; i++;) {
		 */

	}

}
