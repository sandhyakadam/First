/**********************************************************************
 * Purpose: Generate distinct Coupon Numbers using random numbers.
 * 
 * @author  Sandhya Kadam.
 * @version 1.0
 * @since   31-07-2019 
 * 
 ***********************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CouponNumbers
{
	public static void main(String[] args) 
	{
	  
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Coupon Number:");
		int coupon = scanner.nextInt();
		Utility.couponNumber(coupon);
		scanner.close();

	}	

}
