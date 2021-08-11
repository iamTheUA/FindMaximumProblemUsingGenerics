package com.comapany.day13;

import java.util.Scanner;

public class FindMaximumProblemUsingGenerics {

	public static void main(String[] args) {
		Float num1 = 100.5f;
		Float num2 = 12.6f;
		Float num3 = 34.5f;
		String s1 = "Apple";
		String s2 = "Banana";
		String s3 = "Peach";
		Scanner sc = new Scanner(System.in);

		// Enter 3 String or 3 Number.
		TakeObject e1 = new TakeObject(-12d);
		TakeObject e2 = new TakeObject(12d);
		TakeObject e3 = new TakeObject(10d);

		TakeObject.testMax(e1, e2, e3);
	}
}


