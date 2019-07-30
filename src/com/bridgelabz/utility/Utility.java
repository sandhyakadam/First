/******************************************************************
 * Compilation:  javac -d bin ReplaceString.java
 * Execution:    java -cp bin com.bridgelabz.util.ReplaceString n
 * 
 * Purpose:      utility class contain all logics and methode.
 * 
 * @param originalString
 * @param name
 * 
 *******************************************************************/
package com.bridgelabz.utility;

public class Utility {
 
	
		/**
		 * purpose : This methode replace a String with Orignal String.
		 * @param originalString
		 * @param name
		 */
		public void ReplaceString(String originalString, String name) {
		int length = name.length();
		if(length >= 3)
		{
			originalString = originalString.replaceAll("<<UserName>>", name);
			System.out.println(originalString);

		}
		else
		{
			System.out.println("Invalid Output.Please Enter Minimum 3 characters.");
		}
		
		
	}
		//Flipcoin

		public static void flipcoin(int flips) {
		
		int count=0;
		int head=0;
		int tail=0;
		//int count = 1;
		double randomnumber = 0.0;
		float percentage_head = 0.0f, percentage_tail=0.0f;
		if(flips>0)
		{
		System.out.println("Entered number to flip coins is a positive integer.");
		}
		else
		{
		System.out.println("Invalid Number.Please Enter Positive Integer.");
		}
		while(count <= flips)
		{
		//Used random() function for Generating random number
		randomnumber = Math.random();
		if(randomnumber < 0.5)
		{
		tail++;
		System.out.println("tail");
		}
		else
		{
		head++;
		System.out.println("head");
		}
		count++;
		}
		System.out.println("Number of times heads:"+head);
		System.out.println("Number of times tails:"+tail);

		percentage_head= (float)((float)head/flips*100.0);
		percentage_tail = (float)((float)tail/flips*100.0);

		System.out.println("Percentage of heads is:"+percentage_head);
		System.out.println("Percentage of tails is:"+percentage_tail);

		//scanner.close();
		}

	

		public static void leapyear(int year) {
			
			int num=year;
			int count = 0;
			while(num!=0)
			{
				num = num / 10;
				count++;
				
			}
			if(count == 4)
			{
				System.out.println("Entered number is of 4 digits.");
				//Condition to check year is leap year or not
				if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				{

					System.out.println("Entered year is leap year");
				}
				else 
				{
		
					System.out.println("Entered year is not leap year:");
				}
				
			}
			else
			{
				System.out.println("Invalid Input! Please Enter 4 digits number.");
			}
			
		}


		
		
}
