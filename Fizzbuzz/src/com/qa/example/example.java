package com.qa.example;

public class example {
	
	public static void fizzBuzz() {
	
	int num = 100;
 
	for (int i = 1; i <= num; i++) 
	{
	if (((i%5)==0) && ((i%3)==0)) 
		System.out.println("FizzBuzz");
	 else if ((i%5)==0) 
		System.out.println("Fizz");
	 else if ((i%3)==0) 
		System.out.println("Buzz");
	 else 
	    System.out.println(i);
	
	


	}
}
}