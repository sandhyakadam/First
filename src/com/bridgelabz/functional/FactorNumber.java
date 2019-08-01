/**********************************************************************
 * Purpose:  Calculate a prime Factor.  
 * 
 * @author  Sandhya Kadam.
 * @version 1.0
 * @since   31-07-2019 
 * 
 ***********************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FactorNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check whether it is prime factor or not");
		int num = scanner.nextInt();
		Utility.factornumber(num);
		scanner.close();
		
		

	}

}
