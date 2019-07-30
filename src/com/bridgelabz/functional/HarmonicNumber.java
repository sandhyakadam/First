/***************************************************************** 
 * Purpose: Calculating harmonic number
 *
 * @author  Sandhya Kadam
 * @version 1.0
 * @since   30-07-2019 
 * 
 *****************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter n no of Harmonic Number:");
		int number = scanner.nextInt();
		Utility.harmonicNumber(number);
		scanner.close();
		

	}

}
