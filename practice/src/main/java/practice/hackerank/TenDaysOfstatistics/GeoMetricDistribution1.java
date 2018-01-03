package practice.hackerank.TenDaysOfstatistics;

import java.util.Scanner;

public class GeoMetricDistribution1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probNumrator = in.nextInt();
		int probDenomiNator = in.nextInt();
		int nthTrialWhenSuccess = in.nextInt();
		double prob = (double) probNumrator / probDenomiNator;
		// System.out.println(rejectionProb + "::" + norRejctionProb);

		// Geometric Distribution G(n,p) = q*pow(n-1) * P
		double probability = 0;
		probability = probability + Math.pow((1 - prob), nthTrialWhenSuccess - 1) * prob;
		System.out.printf("%.3f\n", probability);
		in.close();
	}

}
