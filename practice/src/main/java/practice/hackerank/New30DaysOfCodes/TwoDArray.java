package practice.hackerank.New30DaysOfCodes;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int maxSum = Integer.MIN_VALUE, sum;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				sum = arr[i - 1][j - 1] + arr[i-1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1]
						+ arr[i+1][j] + arr[i + 1][j + 1];
				if (maxSum < sum) {
					maxSum = sum;
				}
//				System.out.println("max sum " + maxSum + " :: " + arr[i - 1][j - 1] + " , " + arr[i][j - 1] + " , "
//						+ arr[i + 1][j - 1] + " , " + arr[i][j] + " , " + arr[i - 1][j + 1] + " , " + arr[i][j + 1]
//						+ " , " + arr[i + 1][j + 1]);
			}
		}
		System.out.println(maxSum);
		in.close();
	}

}
