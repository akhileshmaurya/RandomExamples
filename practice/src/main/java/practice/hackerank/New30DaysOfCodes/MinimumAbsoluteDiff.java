package practice.hackerank.New30DaysOfCodes;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDiff {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }
    Arrays.sort(a);
    int diff = Integer.MAX_VALUE;
    for (int a_i = 1; a_i < n; a_i++) {
      if (diff > a[a_i] - a[a_i - 1]) {
        diff = a[a_i] - a[a_i - 1];
      }
    }
    System.out.println(diff);
    // your code goes here
    in.close();
  }

}
