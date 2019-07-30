/***************************************************************** 
 * Purpose: Asking for flipping count and printing each flip 
 * 			result
 *
 * @author  Sandhya Kadam
 * @version 1.0
 * @since   30-07-2019 
 * 
 *****************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Flip {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many times you want to flip-");
		int flips = scanner.nextInt();
		Utility.flipcoin(flips);
		scanner.close();
	}

}