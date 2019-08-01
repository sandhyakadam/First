package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Permutation {

	public static void main(String[] args) {

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=scanner.next();
		utility.permutations(s,"");
		scanner.close();

		
	}

}
