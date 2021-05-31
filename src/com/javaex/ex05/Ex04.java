package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//방갯수 변경될 때 for문에서 개수 부분을 변경해줘야 함 
		
		int[] no = new int[8];	//갯수 6-> 8 
		
		for(int i=0; i<8; i++) {
			no[i] = (int)(Math.random()*45)+1;
		}
		
		
		System.out.println(no.length);    //방의 갯수를 몇 개 설정했는지 알 수 있음 
		System.out.println("=================");	
		
		
		for(int i=0; i<no.length; i++) {
			no[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i]);
		}	
		
	}

}
