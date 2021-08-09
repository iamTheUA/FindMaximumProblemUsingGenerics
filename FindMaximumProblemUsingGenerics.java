package Day13;

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
		takeObject e1 = new takeObject(-12d);
		takeObject e2 = new takeObject(12d);
		takeObject e3 = new takeObject(10d);

		takeObject.testMax(e1, e2, e3);
	}
}


