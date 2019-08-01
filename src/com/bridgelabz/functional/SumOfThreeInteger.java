/**********************************************************************
 * 
 * Purpose:   number of triples that sum to exactly Zero.
.
 * 
 * @author  Sandhya Kadam.
 * @version 1.0
 * @since  29-07-2019 
 * 
 ***********************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SumOfThreeInteger {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		int array[]= {0,-1,2,-3,1};
		int size= array.length;
		
		utility.sumofint(array,size);
	}

}
