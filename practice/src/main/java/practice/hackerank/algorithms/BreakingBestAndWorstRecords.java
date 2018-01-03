package practice.hackerank.algorithms;

import java.util.Scanner;

public class BreakingBestAndWorstRecords {

	static int[] getRecord(int[] s) {
		int[] result = new int[2];

		// Complete this function
		if (s.length > 1) {
			int min = s[0], max = s[0];
			for (int i = 1; i < s.length; i++) {
				if (min > s[i]) {
					result[1]++;
					min = s[i];
				}
				if (max < s[i]) {
					result[0]++;
					max = s[i];
				}

			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int[] result = getRecord(s);
		String separator = "", delimiter = " ";
		for (Integer val : result) {
			System.out.print(separator + val);
			separator = delimiter;
		}
		System.out.println("");
		in.close();
	}

}
