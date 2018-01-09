package practice.hackerank.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class EqualityInArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ele;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ele = in.nextInt();
			if (map.containsKey(ele)) {
				map.put(ele, (map.get(ele) + 1));
			} else {
				map.put(ele, 1);
			}
		}
		int maxOccurance = Integer.MIN_VALUE;
		for (Entry<Integer, Integer> bird : map.entrySet()) {
			if (maxOccurance < bird.getValue()) {
				maxOccurance = bird.getValue();
			}

		}
		System.out.println(n - maxOccurance);
		in.close();
	}
}
