package practice.hackerank.algorithms;

import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		// Complete this function
		long point1 = x1, point2 = x2, pDiff = point1 - point2;
		boolean met = false;
		while (true) {
			// System.out.println(point1 + "::" + point2 + "::" + pDiff);
			if (point1 == point2) {
				met = true;
				break;
			}

			point1 = point1 + v1;
			point2 = point2 + v2;
			/// System.out.println("new " + point1 + "::" + point2 + "::" +
			/// pDiff);
			if ((pDiff < 0 && pDiff > (point1 - point2)) || (pDiff > 0 && pDiff < (point1 - point2))) {
				met = false;
				break;
			}
			pDiff = point1 - point2;
		}
		if (met)
			return "YES";
		else
			return "NO";

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		in.close();
	}

}
