package javaDemo;

public class arrays {

	public static void main(String[] args) {
	int x[]=new int[5];
	x[0]=10;
	x[1]=20;
	x[2]=30;
	x[3]=40;
	x[4]=50;
	//for(int i=0;i<=x.length;i++){       //for loop
	//	System.out.println(x[i]);
	//}
	for(int temp:x){                    //for each loop
		System.out.println(temp);
	}
	}

}
