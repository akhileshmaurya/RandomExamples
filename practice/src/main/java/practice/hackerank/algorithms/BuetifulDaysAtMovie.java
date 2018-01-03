package practice.hackerank.algorithms;

import java.util.Scanner;

public class BuetifulDaysAtMovie {

	public static long reverse(long number) {
		long reverse = 0;
		long remainder = 0;
		do {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;

		} while (number > 0);

		return reverse;
	}

	public static boolean isButifulNumber(long n, long k) {
		if (n < 0)
			n = n * (-1);
		long rNumber = reverse(n);
		long diff = rNumber - n;
		if (diff < 0)
			diff = diff * (-1);
		if (diff % k == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long k = in.nextLong();
		long count = 0;
		for (long i = a; i <= b; i++) {
			if (isButifulNumber(i, k))
				count++;
		}
		System.out.println(count);
		in.close();
	}
}
