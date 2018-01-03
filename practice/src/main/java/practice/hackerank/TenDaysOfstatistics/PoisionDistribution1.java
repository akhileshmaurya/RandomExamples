package practice.hackerank.TenDaysOfstatistics;

import java.util.Scanner;

public class PoisionDistribution1 {

	private static double e = 2.71828;

	static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	private static double calCulatePoisionDistribution(double avgSuccessInspecificRegion,
			double actualSuccessInspecificRegion) {
		// Poision distribution formula
		// P(k,lamda)=lamda.pow(k)*e.pow(lamda)/factorial(k)

		return Math.pow(avgSuccessInspecificRegion, actualSuccessInspecificRegion)
				* Math.pow(e, -avgSuccessInspecificRegion) / factorial((int) actualSuccessInspecificRegion);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double avgSuccessInspecificRegion = in.nextDouble();
		int actualSuccessInspecificRegion = in.nextInt();

		double probability = calCulatePoisionDistribution(avgSuccessInspecificRegion, actualSuccessInspecificRegion);

		System.out.printf("%.3f\n", probability);
		in.close();
	}

}
