/***************************************************************** 
 * Purpose: Gambler play a game to reach a goal.
 *
 * @author  Sandhya Kadam
 * @version 1.0
 * @since   30-07-2019 
 * 
 *****************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Gamblar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Stake:");
    	int stake = scanner.nextInt();
    	System.out.println("Enter Goal:");
		int goal = scanner.nextInt();
		System.out.println("Enter number of times:");
		int number = scanner.nextInt();
		Utility.gamblar(stake , goal, number);
		scanner.close();
		

	}

}
