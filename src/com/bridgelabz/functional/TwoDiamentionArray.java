/**********************************************************************
 * Purpose: Creating two dimensional Array
 * @author  Sandhya Kadam.
 * @version 1.0
 * @since   31-07-2019 
 * 
 ***********************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TwoDiamentionArray {

	public static void main(String[] args) 
	{
		int row;
		int column; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row for array:");
		row = scanner.nextInt();
		System.out.println("Enter column for array:");
		column = scanner.nextInt();
		System.out.println("Enter array Elements:");
		Utility.twodimensionarray(row , column);
		scanner.close();
		
	}

}
