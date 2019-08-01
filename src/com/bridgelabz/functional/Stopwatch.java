package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Stopwatch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start to start stopwatch:");
		String startime= scanner.next();
        Utility.stopwatch(startime);
        scanner.close();
	}

}
