package javaDemo;

import java.util.ArrayList;

public class methods {

	public static void main(String[] args) {
	methods p =new methods();
		String pstatus=p.method3(true);
		System.out.println(pstatus);
		
		System.out.println(p.method4(20, 30));
		
		int c=p.method1(3, 2);
		System.out.println(c);
		
		p.method2();
				
	}
	
	public static int method1(int a, int b) {
		int c=a+b;
		return c;		
	}
	
	public static void method2() {
		int c=5-2;
		System.out.println("value of c : "+c);
	}
	
	public String method3(boolean x) {
		   String status=null;
		if(x==true) {
			status="PASS";
		   }
		return status;
	}
	
	public int method4(int i, int j) {
		return i*j;

	}
}