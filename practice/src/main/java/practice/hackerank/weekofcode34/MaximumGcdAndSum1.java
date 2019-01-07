package practice.hackerank.weekofcode34;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaximumGcdAndSum1 {

  static int gcd(int a, int b) {
    if (a == 0 || b == 0)
      return 0;
    if (a == b)
      return a;
    if (a > b)
      return gcd(a - b, b);
    return gcd(a, b - a);
  }

  static int maximumGcdAndSum(int[] A, int[] B, int m, int p) {
    // Complete this function
    int maxSum = Integer.MIN_VALUE, maxGcd = Integer.MIN_VALUE, gcd;
    Set<String> alreadyCalculated = new HashSet<String>();
    for (int i = 0; i < p; i++) {
      for (int j = 0; j < m; j++) {
        if (!(alreadyCalculated.contains(B[i] + ":" + A[j])
            || alreadyCalculated.contains(A[j] + ":" + B[i]))) {
          gcd = gcd(A[j], B[i]);
          alreadyCalculated.add(A[j] + ":" + B[i]);
          if (gcd > maxGcd) {
            maxGcd = gcd;
            maxSum = A[j] + B[i];
          } else if (gcd == maxGcd && (A[j] + B[i]) > maxSum) {
            maxSum = A[j] + B[i];
          }
        }
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] A = new int[n];
    int m = 0, p = 0, ele;
    Set<Integer> uniq = new HashSet<Integer>();
    for (int A_i = 0; A_i < n; A_i++) {
      ele = in.nextInt();
      if (!uniq.contains(ele)) {
        A[m++] = ele;
        uniq.add(ele);
      }
    }
    int[] B = new int[n];
    uniq.clear();
    for (int B_i = 0; B_i < n; B_i++) {
      ele = in.nextInt();
      if (!uniq.contains(ele)) {
        B[p++] = ele;
        uniq.add(ele);
      }
    }
    int res = maximumGcdAndSum(A, B, m, p);
    System.out.println(res);
    in.close();
  }

}
