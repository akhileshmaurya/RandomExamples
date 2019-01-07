package practice.hackerank.algorithms;

import java.util.Scanner;

public class TheBirthdayBar {

  static int solve(int n, int[] s, int d, int m) {
    // Complete this function
    int result = 0;
    int sum = 0, remove = 0;
    for (int i = 0; i < n; i++) {
      if (i > m - 1)
        remove = s[i - m];

      sum = sum + s[i] - remove;
      // System.out.println(i + "::" + sum + "::" + remove);
      if (i >= m - 1 && sum == d)
        result++;

    }
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] s = new int[n];
    for (int s_i = 0; s_i < n; s_i++) {
      s[s_i] = in.nextInt();
    }
    int d = in.nextInt();
    int m = in.nextInt();
    int result = solve(n, s, d, m);
    System.out.println(result);
    in.close();
  }

}
