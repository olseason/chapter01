package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] no = new int[6];	//갯수 
		
		for(int i=0; i<6; i++) {
			no[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<6; i++) {
			System.out.println(no[i]);
		}	
		
	
		/*
		for(int i=0; i<=6; i++) {
			no[i] = (int)(Math.random()*45)+1;    //1<6  1<=6 6번방은 없다 -> 예외발생 
		}
		*/
		
		
	}

}
