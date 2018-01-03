package practice.hackerank.algorithms;

import java.util.Scanner;

public class PaperCutting {

	public static void main(String[] args) throws Exception {
		Scanner br = new Scanner(System.in);

		long m = br.nextInt();
		long n = br.nextLong();
		System.out.println(calculateCount(m, n));
		br.close();
	}

	private static long calculateCount(long n, long m) {
		if (n <= 2 && m <= 2) {
			if (n == 2 && m == 2)
				return 2;
			else if (n == 1 && m == 1)
				return 0;
			else
				return 1;
		}
		long n1 = n, m1 = m, p = 0, q = 1, modm = 0, modn = 0;
		if (n >= 4) {
			n1 = n / 2;
			p++;
		}
		if (m >= 4) {
			m1 = m / 2;
			p++;
		}
		if (m % 2 == 1 && m > 1) {
			p++;
			modm = 1;
			if (m1 == m)
				m1 = m1 - 1;
		}
		if (n % 2 == 1 && n > 1) {
			p++;
			modn = 1;
			if (n1 == n)
				n1 = n - 1;
		}
		if (m >= 4 && n >= 4)
			q = 4;
		else if (m >= 4 || n >= 4)
			q = 2;
		if(modn==1 && modn==1)
			n--;
		System.out.println(n1 + " " + m1 + " " + p + " " + q+" "+modm+" "+modn+" "+m+" "+n);
		return (calculateCount(n1, m1) * q + (n - 1) * modm + (m - 1) * modn + p);
	}

}
