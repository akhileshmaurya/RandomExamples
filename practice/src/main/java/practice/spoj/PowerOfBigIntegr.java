package practice.spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerOfBigIntegr {

	public static double pow(double a, double b) {
		if (a == 1)
			return 1;
		else
			return Math.pow(a, b);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println(Long.MAX_VALUE);
		long t = Long.parseLong(br.readLine());
		long x, a, y, b;
		for (int i = 0; i < t; i++) {
			String[] input = br.readLine().trim().split(" ");
			x = Long.parseLong(input[0]);
			a = Long.parseLong(input[1]);
			y = Long.parseLong(input[2]);
			b = Long.parseLong(input[3]);
			if ((!(x > y && a > b) && !(x < y && a < b)) && pow(x, a) == pow(y, b)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
