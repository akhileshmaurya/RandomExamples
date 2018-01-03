package practice.hackerank.weekofcode34;

import java.util.Scanner;

public class OnceATram {

	static int sumOfdigit(int x) {
		return x % 10 + x / 100 + ((x / 10) % 10);
	}

	static String onceInATram(int n) {
		// Complete this function
		int x = n + 1;
		for (; x <= 999999; x++) {
			int first = x / 1000;
			int second = x % 1000;
			int sf = sumOfdigit(first);
			int ss = sumOfdigit(second);
		//	System.out.println(first + ":" + second + ", " + sf + ":" + ss);
			if (sf == ss) {
				break;
			}
		}
		return String.valueOf(x);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		String result = onceInATram(x);
		System.out.println(result);
		in.close();
	}

}
