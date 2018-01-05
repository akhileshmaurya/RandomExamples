package practice.spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//http://www.spoj.com/problems/FRNDAM/
public class Friendship {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] input = br.readLine().trim().split(" ");
			long a = Long.parseLong(input[0]);
			long b = Long.parseLong(input[1]);
			if (a == sumofDivisors(b) && b == sumofDivisors(a)) {
				System.out.println("Friendship is ideal");
			} else {
				System.out.println("Friendship is not ideal");
			}
		}
	}

	static long sumofDivisors(long n) {
		long sum = 1l;
		for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {

				if (n / i == i)
					sum = sum + i;

				else
					sum = sum + i + (n / i);
			}
		}
		return sum;
	}

}
