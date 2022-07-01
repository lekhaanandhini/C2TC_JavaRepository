package com.acharya.wrapperclass;

public class Autoboxing {

	public static void main(String[] args) {
		int a =10; //Primitive 
		
		Integer i = Integer.valueOf(a); //Older version of autoboxing
		
		Integer k = a; // Newer Version of autoboxing
		
		System.out.println(a + " "+ i + " "+ k);
		
	}

}
