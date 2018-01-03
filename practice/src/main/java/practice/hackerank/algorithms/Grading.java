package practice.hackerank.algorithms;

import java.util.Scanner;

public class Grading {

	static int[] solve(int[] grades) {
		int[] result = new int[grades.length];
		int k;
		// Complete this function
		for (int i = 0; i < grades.length; i++) {
			k = grades[i] % 5;
			if (grades[i] >= 38 && k >= 3) {
				result[i] = grades[i] + (5 - k);

			} else {
				result[i] = grades[i];
			}

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
		in.close();

	}

}
