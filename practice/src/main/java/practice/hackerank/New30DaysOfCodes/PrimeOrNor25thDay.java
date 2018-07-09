package practice.hackerank.New30DaysOfCodes;

import java.util.Scanner;

public class PrimeOrNor25thDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			if (isPrime(ele)) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}
		sc.close();
	}

	private static boolean isPrime(int ele) {
		if (ele == 2 || ele == 3)
			return true;
		if (ele == 1 || ele % 2 == 0 || ele % 3 == 0)
			return false;
		int start = 5;
		int counter = 2;
		// int sqrt = (int) Math.sqrt(ele);
		boolean isPrime = true;
		while (start * start <= ele) {
			if (ele % start == 0) {
				isPrime = false;
				break;
			}
			start = start + counter;
			counter = 6 - counter;
		}
		return isPrime;
	}
}
