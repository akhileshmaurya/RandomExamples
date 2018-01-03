
package practice.hackerank.New30DaysOfCodes;

import java.util.Scanner;

public class Recursion {

	static int factorial(int n) {
		// Complete this function
		if (n == 0 || n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = factorial(n);
		System.out.println(result);
		in.close();
	}

}
