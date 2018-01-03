package practice.hackerank.TenDaysOfstatistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MeanMedianMoad {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long elements[] = new long[n];
		Map<Long, Integer> mapping = new HashMap<Long, Integer>();
		long sum = 0, moad = Long.MAX_VALUE, maxCount = 0, ele;
		for (int i = 0; i < n; i++) {
			ele = in.nextLong();
			sum = sum + ele;
			elements[i] = ele;
			if (mapping.containsKey(ele)) {
				mapping.put(ele, (mapping.get(ele) + 1));
			} else
				mapping.put(ele, 1);

		}
		Arrays.sort(elements);
		for (Entry<Long, Integer> set : mapping.entrySet()) {
			if (maxCount == set.getValue() && moad > set.getKey())
				moad = set.getKey();
			else if (maxCount < set.getValue()) {
				maxCount = set.getValue();
				moad = set.getKey();
			}

		}
		// System.out.println(sum / n);
		double val = (double) sum / n;
		System.out.printf("%.1f\n", val);
		if (n % 2 != 0) {
			System.out.println(elements[(n / 2)]);
		} else {
			// System.out.println((elements[n / 2] + elements[(n / 2) + 1]) /
			// 2);
			val = (double) (elements[n / 2] + elements[(n / 2) - 1]) / 2;
			System.out.printf("%.1f\n", val);
		}
		System.out.println(moad);
		in.close();
	}

}
