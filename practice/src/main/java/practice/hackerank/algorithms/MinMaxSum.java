package practice.hackerank.algorithms;

import java.util.Scanner;

public class MinMaxSum {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long[] arr = new long[5];
    long tMin = Long.MAX_VALUE, tMax = Long.MIN_VALUE, sum = 0;
    for (int arr_i = 0; arr_i < 5; arr_i++) {
      arr[arr_i] = in.nextLong();
      sum = sum + arr[arr_i];
      if (tMin > arr[arr_i])
        tMin = arr[arr_i];
      if (tMax < arr[arr_i])
        tMax = arr[arr_i];

    }
    System.out.println((sum - tMax) + " " + (sum - tMin));
    in.close();
  }

}
