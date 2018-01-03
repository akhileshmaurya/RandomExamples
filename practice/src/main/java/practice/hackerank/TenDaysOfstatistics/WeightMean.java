package practice.hackerank.TenDaysOfstatistics;

import java.util.Scanner;

public class WeightMean {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long elementsX[] = new long[n];
		long bigsum = 0, sum = 0, ele;
		for (int i = 0; i < n; i++) {
			elementsX[i] = in.nextLong();

		}
		for (int i = 0; i < n; i++) {
			ele = in.nextLong();
			sum = sum + ele;
			bigsum = bigsum + (ele * elementsX[i]);

		}

		double val = (double) bigsum / sum;
		System.out.printf("%.1f\n", val);
		in.close();

	}

}
