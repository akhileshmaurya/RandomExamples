package practice.hackerank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	static int birthdayCakeCandles(int n, int[] ar) {
		int result = 1;
		// Complete this function
		Arrays.sort(ar);

		for (int i = n - 1; i > 0; i--) {
			//System.out.println(i + ":" + ar[i]);
			if (ar[i] == ar[i - 1])
				result++;
			else
			 break;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
		in.close();
	}

}
