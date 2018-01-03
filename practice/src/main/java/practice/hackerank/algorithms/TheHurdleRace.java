package practice.hackerank.algorithms;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		int maxHurdle = Integer.MIN_VALUE;
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
			if (height[height_i] > maxHurdle)
				maxHurdle = height[height_i];
		}
		// your code goes here
		if (maxHurdle <= k)
			System.out.println("0");
		else {
			System.out.println((maxHurdle - k));
		}
		in.close();
	}

}
