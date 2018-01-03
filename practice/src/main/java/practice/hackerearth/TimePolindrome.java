package practice.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TimePolindrome {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			Map<String, Integer> counts = calculatePolindromes();

			while (t > 0) {
				String input[] = br.readLine().split(" ");
				int m = counts.get(input[0]);
				int m1 = counts.get(input[1]);
				int result = m1 - m;
				if (isPolindrome(input[0]))
					result++;
				System.out.println(result);
				t--;
			}
		} catch (Exception e) {

		}
	}

	private static Map<String, Integer> calculatePolindromes() {
		Map<String, Integer> counts = new HashMap<String, Integer>();
		int number[] = new int[4];
		int count = 0;
		for (int i = 0; i < 2400;) {
			updateNumber(number, i);
			if (isPolindrome(number)) {
				count++;
			}
			String key = toString(number);
			counts.put(key, count);
			if (i % 100 == 59)
				i = ((i / 100) + 1) * 100;
			else
				i++;
		}
		return counts;
	}

	private static String toString(int[] number) {
		return "" + number[0] + number[1] + number[2] + number[3];
	}

	private static boolean isPolindrome(int[] number) {
		if (number[0] == number[3] && number[1] == number[2])
			return true;
		return false;
	}

	private static boolean isPolindrome(String number) {
		if (number.charAt(0) == number.charAt(3) && number.charAt(1) == number.charAt(2))
			return true;
		return false;
	}

	private static void updateNumber(int[] number, int i) {
		for (int j = number.length - 1; j >= 0; j--) {
			number[j] = i % 10;
			i = i / 10;
		}

	}

}
