/**********************************************************************
 * 
 * Purpose: Calculating Euclidean distance.
 * 
 * @author  Sandhya Kadam.
 * @version 1.0
 * @since  29-07-2019 
 * 
 ***********************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
    
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number to calculate a Distance : ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        utility.distance(x,y);
		scanner.close();


	}

}
