package javaDemo;

public class nestedif {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	if(a>b){
		if(a>c){
			System.out.println("a is greater than b,c");
		}
		}else if(b>a){
			if(b>c){
				System.out.println("b is greater than b,c");
		}
	}else if(c>a){
		if(c>b){
			System.out.println(" c is greater than a,b");
	}

	}

	}
}
