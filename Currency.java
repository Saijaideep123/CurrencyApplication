package com.mono.ifelse;

import java.util.Scanner;

public class Currency {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount:");
	int amount=sc.nextInt();

	if (amount<50000)
	{
		
		int val=amount/2000;

		System.out.println("two thousand notes: "+val); 
		int fivehundred=amount-(val*2000);

		int value =fivehundred/500;

		System.out.println("fivehundred notes: "+value);

		int twohundred =(amount-(val*2000+value*500));

		int valuet=twohundred/200; 
		System.out.println("two hundred notes: "+valuet);
		int valuef=amount-(val*2000+value*500+valuet*200);

		int hundred=valuef/100; 
		System.out.println("hundredsare: "+hundred);
	

	   
	}
	     
	}
}
	
	
	


