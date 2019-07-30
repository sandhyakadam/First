/***************************************************************** 
 * Purpose: Check a year is leap year or not.
 *
 * @author  Sandhya Kadam
 * @version 1.0
 * @since  30-07-2019 
 * 
 *****************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year to check whether it is leap year or not:");
		int year=scanner.nextInt();
		Utility.leapyear( year);
		scanner.close();

	}

}
