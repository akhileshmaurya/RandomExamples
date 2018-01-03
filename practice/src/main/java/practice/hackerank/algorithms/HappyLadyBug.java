package practice.hackerank.algorithms;

import java.util.Scanner;

public class HappyLadyBug {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();
		int charArray[] = new int[26];
		for (int a0 = 0; a0 < Q; a0++) {
			for (int i = 0; i < charArray.length; i++) {
				charArray[i] = 0;
			}
			int n = in.nextInt();
			String b = in.next();
			boolean isUnderscore = false;
			boolean isSorted = true;
			for (int i = 0; i < n; i++) {
				Character ch = b.charAt(i);
				if (i != 0 && ch != '_' && ch != b.charAt(i - 1) && charArray[(int) (ch - 'A')] > 0) {
					isSorted = false;
					charArray[(int) (ch - 'A')]++;
				} else if (ch == '_') {
					isUnderscore = true;
				} else {
					charArray[(int) (ch - 'A')]++;
				}
			}
			boolean output = true;
			if (!isUnderscore && !isSorted) {
				output = false;
			} else {
				for (int i = 0; i < charArray.length; i++) {
					if (charArray[i] == 1) {
						output = false;
						break;
					}

				}
			}
			if (output)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
