package practice.hackerank.algorithms;

import java.util.Scanner;

public class StrangeAdvertising {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int startNum = 2, startSum = 2;
		for (int i = 1; i < n; i++) {
			startNum = (int) startNum * 3 / 2;
			startSum += startNum;

		}
		System.out.println(startSum);
		in.close();
	}

}
