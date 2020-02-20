package javaDemo;

public class twodimensionalarray {

	public static void main(String[] args) {
		Object x[][]=new Object[2][3];
		x[0][0]=10;
		x[1][2]=20;
		x[2][3]=30;
		
		for(int i=1;i<x.length;i++){
			for(int j=1;j<x[i].length;j++){
				System.out.println(x[i][j]);
			}
		}

	}

}
