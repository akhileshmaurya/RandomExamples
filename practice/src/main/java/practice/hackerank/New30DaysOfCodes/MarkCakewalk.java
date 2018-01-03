package practice.hackerank.New30DaysOfCodes;

import java.util.Arrays;
import java.util.Scanner;

public class MarkCakewalk {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] calories = new int[n];
		for (int calories_i = 0; calories_i < n; calories_i++) {
			calories[calories_i] = in.nextInt();
		}
		Arrays.sort(calories);
		long powOf2 = 1, milesSum = 0;
		for (int calories_i = n - 1; calories_i >= 0; calories_i--) {
			milesSum += calories[calories_i] * powOf2;
			powOf2 = powOf2 * 2;
		}
		System.out.println(milesSum);
		in.close();
	}

}
