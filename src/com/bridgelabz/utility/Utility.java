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

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Utility {
 
	
		/**
		 * purpose : This method replace a String with Original String.
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
	   /**
	    * purpose: Flipcoin for Printing each flipcount.
		*/			
        public static void flipcoin(int flips) {
		int count=0;
		int head=0;
		int tail=0;
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

		/**
		 * purpose : Random() Function For Generate Numbers to win or lose.
		 * 
		 */	
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


		}

	    /**
		 * purpose: Checking  a year is leap year or not.
		 */
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
		
		


		/**
		 * purpose: Calculating harmonicNumber .
		 */
		public static void harmonicNumber(int number) {

			if(number > 0)
			{
				System.out.println("Valid input for finding Harmonic Number.");
				
				float harmonic =1;
		
				for(int i=2; i<=number; i++)
				{
					harmonic += (float)1/i;
					
				}
				
				System.out.println("Harmonic Number is"+harmonic);
			}
			else
			{
				System.out.println("Invalid Input. Please enter number not equal to 0");
			}
			
		}
		/**
		 * purpose: Calculating factornumber .
		 */
		public static void factornumber(int num)
		{
			
			for(int i=2; i< num; i++)
			{
				while(num%i == 0)
				{
				
					System.out.println(i);
					num= num/i;
				}
			}
			if(num > 2)
			{
				
				System.out.println(num );
			}

		  }

		
		public static void gamblar(int stake, int goal, int number) 
		{

			
		
			int bits=0;
			float Win=0 , Lose=0;
			float percentWin =0; 
			float percentLose=0;
			
			if(stake <= goal)
			{
				
				for(int i=0; i<number; i++)
				{
					int money=stake;
					while(money>0 && money < goal)
					{
						bits++;

						/**
						 * purpose : Random Function For Generate Numbers to win or lose.
						 * 
						 */
						if(Math.random() > 0.5)
						{
							money++;
							
						}
						else 
						{
							money--;
						}
					}
					if(money==goal)
					{
						Win++;
						
					}
				}
				float lose = number - Win;
				percentWin = (float)Win/number*100;
				percentLose = (float)lose/number*100;
				System.out.println("Total number of wins: "+Win);
		  		System.out.println("Total number of lose: "+lose);
				System.out.println("Percentage of win: "+percentWin);
				System.out.println("Percentage of lose: "+percentLose);
				if(Win > lose )
				{
					System.out.println(" you are Winner!!");
				}
				else
				{
					System.out.println("you are loser!!");
				}
			}
			else 
			{
				System.out.println("Invalid Input. Please enter stake greater than zero");
			}
			
		}
     
		/**
		 * purpose : Generate coupon Numbers.
		 * @param coupon
		 */
		public static void couponNumber(int coupon) {
		
			Random random_number = new Random();
			int distinct = 0, count = 0;
			int[] collection = new int[coupon];
			
			for(int i=1; i<=coupon; i++)
			{
				int random_no= random_number.nextInt(1000);
				System.out.println("Generating Distinct Random Numbers for Entered Coupon Number:"+random_no);
			}
			while(distinct < coupon)
			{
				/**
				 * purpose : Random Function for generating a random values.
				 * 
				 */
				int value = (int) (Math.random()*coupon);
				count++;
				if(collection[value]!=1)
				{
					distinct++;
					collection[value]=1;
				}
			}
			System.out.println("Total no of trials to get "+coupon+" different coupon number's are "+count);


			
		}
		
		  /**
		   * purpose : 2 Dimensional Array.
		   * @param row , column
		   */
	       public static void twodimensionarray(int row, int column) {
			
			int i;
			int j;
			int array[][]=new int[10][10];
			Scanner scanner = new Scanner(System.in);
			for(i=0; i<row; i++)
			{
				for(j=0; j<column; j++)
				{
					array[i][j]= scanner.nextInt();
				}
			}
		
			System.out.print("Display array elements:\n");
			
			PrintWriter pw = new PrintWriter(System.out);
			
			/**
			 * purpose : for loop is used to display array elements
			 * 
			 */
			for(i=0; i<row; i++)
			{
				
				for(j=0; j<column; j++)
				{
					pw.print(+array[i][j]+"\t");
				}
				pw.println();
			}
			pw.flush();
			
		}
	       /** 
			* purpose : number of triples that sum to exactly Zero.
			*/
		public void sumofint(int[] array, int size) {
			int count = 0;
			for (int i = 0; i < size; i++) {
				for (int j = i+1; j < size; j++) {
					for (int k = j+1; k < size; k++) {
						if ((array[i] + array[j] + array[k]) == 0)
						{
							System.out.println(array[i] + " + " + array[j] + " + "
									+ array[k] + " = 0 ");
							count++;
						}
					}
				}
			}
			System.out.println("The number of such distinct triplet pairs are : "
					+ count);
			
		}
		
		  /** 
		   * purpose : calculating  Euclidean distance .
		   */
	    	public void distance(int x, int y) {
			 double Distance;
             Distance = Math.sqrt(x*x + y*y);// formulae of distance using math.power function
	         
	         System.out.println("Distance from " + "x" + " " + "and"+ " " + "y" +" " + "from (0,0) is : " + Distance );

			
		}
		public void permutations(String s, String ans) {
			
			if(s.length()==0)
			{
				System.out.println(ans);
				return;
			}
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				String res=s.substring(0, i) + s.substring(i+1);
				permutations(res,ans+ch);
			}      
			
		}
		/**
		 * @purpose system.currentTimeMillis() used to get current time from system.
		 * @param startime
		 * @param endtime
		 */
		public static void stopwatch(String startime) {
			
			Scanner scanner = new Scanner(System.in);
			long starttime = System.currentTimeMillis(); 
			System.out.println("Enter end to end stopwatch:");
			String endtime= scanner.next();
			long endtime1 = System.currentTimeMillis();
			double time= (endtime1 - starttime)/1000.0;
			System.out.println("Elapsed Time: "+time);
			
			
			
		}
		
}


			
		
		


		
		

