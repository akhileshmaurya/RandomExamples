package practice.hackerank.New30DaysOfCodes;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}

}

class Difference {

	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		this.elements = a;
	}

	public void computeDifference() {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < elements.length; i++) {
			if (min > elements[i])
				min = elements[i];
			if (max < elements[i])
				max = elements[i];
		}

		maximumDifference = max - min;
		if (maximumDifference < 0)
			maximumDifference = maximumDifference * (-1);

	}

}
