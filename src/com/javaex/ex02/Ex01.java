package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "이시즌";
		
		
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println(i);
		
		
		System.out.print("안녕");
		System.out.print("하세");
		/* print는 옆에서 계속 붙는 속성을 가지고 있음 */
		
		System.out.println("안녕");
		System.out.println("하");
		System.out.println("===========");
		
		System.out.println(i);
		System.out.println(i+i); 
		
		System.out.println(str);
		System.out.println(str+str);
		
		System.out.println(str+i); // "굿모닝" + 2345 -> "굿모닝 + 2345" 
		System.out.println(str+d); // "굿모닝 + 3.14 ->  "굿모닝 + 3.14"	
		System.out.println( str+ " 이랑 " + i );
		System.out.println(str+ " " + i + " 다");
		
		//주의
		System.out.println(c);
		System.out.println( c + c ); //char형은 숫자로 생각해서 숫자로 나옴
		System.out.println( s + s ); 
		
		// 제이름은 이시즌 입니다.
		System.out.println("제이름은 "+ name + " 입니다." );
		
		System.out.println("안녕'하'세요");
		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\\하\\세요");
		System.out.println("안녕\t하\t세요");
		System.out.println("안녕\n하\n세요");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
