package practice.hackerank.TenDaysOfstatistics;

import java.util.Scanner;

public class BinomialDistribution1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double boys = in.nextDouble();
		double girls = in.nextDouble();
		double boyProb = (double) boys / (boys + girls);
		double girlProb = (double) girls / (boys + girls);
		System.out.println(boyProb + "::" + girlProb + "::" + (1 - boyProb));
		int n = 6;

		double probability = 0.0;
		for (int i = n; i >= 3; i--) {
			probability += findNCR(n, i) * Math.pow(boyProb, i) * Math.pow(girlProb, 6 - i);
		}
		System.out.printf("%.3f", probability);

		in.close();
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
