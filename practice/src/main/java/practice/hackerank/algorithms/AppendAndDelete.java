package practice.hackerank.algorithms;

import java.util.Scanner;

public class AppendAndDelete {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();
		in.close();
		int l1 = s.length();
		int l2 = t.length();
		int minLength = l1;
		if (l2 < minLength)
			minLength = l2;
		int i = 0;
		for (i = 0; i < minLength; i++) {
			if (s.charAt(i) != t.charAt(i))
				break;
		}
		int operationInS = l1 - i;
		int operationInT = l2 - i;
		// System.out.println(operationInS + "\t" + operationInT + "\t" + k +
		// "\t" + l1 + "\t" + l2 + " ::"
		// + (k - operationInS - operationInT));
		if ((operationInS != 0 && operationInT != 0) && (operationInS + operationInT) > k) {
			System.out.println("No");
		} else {
			if (operationInS == 0 && operationInT == 0 && ((l1 + l2) <= k || k % 2 == 0))
				System.out.println("Yes");
			else {
				if ((operationInS + operationInT) == k || (k - operationInS + operationInT) % 2 == 0 || (l1 + l2) <= k)
					System.out.println("Yes");
				else {
					System.out.println("No");
				}
			}
		}
	}

}
