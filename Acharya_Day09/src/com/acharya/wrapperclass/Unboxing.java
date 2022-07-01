package com.acharya.wrapperclass;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		
		int j =a.intValue(); //older version of unboxing
		
		
		int i = a; //newer version of unboxing
		
		System.out.println(a + " "+ j + " "+ i);
		

	}

}
