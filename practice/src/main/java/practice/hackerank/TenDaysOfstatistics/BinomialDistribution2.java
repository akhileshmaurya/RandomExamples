package practice.hackerank.TenDaysOfstatistics;

import java.util.Scanner;

public class BinomialDistribution2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double percentageOfdefected = in.nextDouble();
		double totalPistols = in.nextDouble();
		double rejectionProb = percentageOfdefected / 100;
		// System.out.println(rejectionProb + "::" + norRejctionProb);

		double probability = 0.0;
		for (int i = 2; i >= 0; i--) {
			probability += binomial((int) totalPistols, i, rejectionProb);
		}

		System.out.printf("%.3f\n", probability);
		probability = 0.0;
		/* "At least 2 rejects" */
		probability = 1 - binomial((int) totalPistols, 0, rejectionProb)
				- binomial((int) totalPistols, 1, rejectionProb);
		System.out.printf("%.3f\n", probability);
		in.close();
	}

	private static double binomial(int n, int x, double p) {

		return findNCR(n, x) * Math.pow(p, x) * Math.pow(1 - p, n - x);
	}

	static double findNCR(int n, int r) {
		int rfact = 1, nfact = 1, nrfact = 1, temp1 = n - r, temp2 = r;
		if (r > n - r) {
			temp1 = r;
			temp2 = n - r;
		}
		for (int i = 1; i <= n; i++) {
			if (i <= temp2) {
				rfact *= i;
				nrfact *= i;
			} else if (i <= temp1) {
				nrfact *= i;
			}
			nfact *= i;
		}
		return nfact / (double) (rfact * nrfact);
	}

}
