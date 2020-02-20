package javaDemo;

public class objectarray {

	public static void main(String[] args) {
		Object x[]=new Object[5];

		x[0]=10;
		x[1]='c';
		x[2]="java";
		x[3]=40.2;
		x[4]=false;
		//for(int i=1;i<=x.length;i++){             //for loop
		//	System.out.println(x[i]);
		//}
for(Object temp:x){                  //for each loop
	System.out.println(temp);
}
	}

}
