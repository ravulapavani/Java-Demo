package javaDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
	ArrayList<String>x=new ArrayList<String>();
	x.add("50");
	x.add("java");
	x.add("selenium");
	x.add("automation");
	x.add("testing");
	x.add(5,"mobile testing");
//for(int i=0;i<x.size();i++){                    //for loop
	//System.out.println(x.get(i));
//}
	//for(String temp:x){
//		System.out.println(temp);                        //for each loop
	//}
	Iterator<String>itr=x.iterator();                      //iterator
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	}

}
