package practice.hackerank.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ElectronicShop {

	static int getMoneySpent(int[] keyboards, Integer[] drives, int s) {
		// Complete this function
		Arrays.sort(keyboards);
		Arrays.sort(drives, Collections.reverseOrder());
		int result = -1;
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if (keyboards[i] + drives[j] > s)
					break;
				if (keyboards[i] + drives[j] > result)
					result = keyboards[i] + drives[j];

			}

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] keyboards = new int[n];
		for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
			keyboards[keyboards_i] = in.nextInt();
		}
		Integer[] drives = new Integer[m];
		for (int drives_i = 0; drives_i < m; drives_i++) {
			drives[drives_i] = in.nextInt();
		}
		// The maximum amount of money she can spend on a keyboard and USB
		// drive, or -1 if she can't purchase both items
		int moneySpent = getMoneySpent(keyboards, drives, s);
		System.out.println(moneySpent);
		in.close();
	}

}
