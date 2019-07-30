/***************************************************************** 
 * Purpose:     Replace String with Username.
 *
 * @author  Sandhya Kadam
 * @version 1.0
 * @since  29-07-2019 
 * 
 *****************************************************************/
		 
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ReplaceString {
	
	public static void main(String[] args) {
        
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);

		String originalString = "Hello <<UserName>>, How are you?";

		System.out.println("Enter your Name:");
		String name = scanner.next();
           
		utility.ReplaceString(originalString, name);
		scanner.close();
	}
}
