package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("=========================");
		
		int[] arrB = new int[3];       //int[] arrB = arrA; 비교 
		
		arrB[0] = arrA[0];
		
		//값 복사 
		for(int i=0; i<arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		
		
		//arrA 출력  
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("=========================");
		//arrB 출력 
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("=========================");
		
		//arrA[1] 6-> 100 변경    
		arrA[1] = 100;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("=========================");
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		
		
		
		

	}

}
