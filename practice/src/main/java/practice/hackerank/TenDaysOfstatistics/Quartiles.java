package practice.hackerank.TenDaysOfstatistics;

import java.util.Arrays;
import java.util.Scanner;

public class Quartiles {

	private static double median(long[] sortedArray, int start, int end) {
		int size = end - start + 1;
		double result = 0l;
		int index = (end + start) / 2;
		//System.out.println("start :" + start + ", end:" + end + ", size :" + size + ", index :" + index);
		if (size % 2 != 0) {
			result = (double) sortedArray[index];
		} else {
			result = (double) (sortedArray[index] + sortedArray[index + 1]) / 2;

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long elements[] = new long[n];
		for (int i = 0; i < n; i++) {
			elements[i] = in.nextLong();
		}
		Arrays.sort(elements);
		//System.out.println("sorted :" + Arrays.toString(elements));
		double q1, q3;
		double q2 = median(elements, 0, n - 1);
		if (n % 2 != 0) {
			q1 = median(elements, 0, (n / 2) - 1);
			q3 = median(elements, (n / 2 + 1), n - 1);
		} else {
			q1 = median(elements, 0, (n / 2) - 1);
			q3 = median(elements, n / 2, n - 1);
		}
		// System.out.println(q1 + "\n" + q2 + "\n" + q3);
		System.out.printf("%.0f\n%.0f\n%.0f\n", q1, q2, q3);
		in.close();

	}

}
