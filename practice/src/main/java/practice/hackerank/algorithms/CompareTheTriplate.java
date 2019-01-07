package practice.hackerank.algorithms;

import java.util.Scanner;

public class CompareTheTriplate {

  static int alicePoint(int i, int j) {
    if (i > j)
      return 1;
    return 0;
  }

  static int bobPoint(int i, int j) {
    if (j > i)
      return 1;
    return 0;

  }

  static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
    int result[] = new int[2];
    result[0] = result[0] + alicePoint(a0, b0);
    result[1] = result[1] + bobPoint(a0, b0);
    result[0] = result[0] + alicePoint(a1, b1);
    result[1] = result[1] + bobPoint(a1, b1);
    result[0] = result[0] + alicePoint(a2, b2);
    result[1] = result[1] + bobPoint(a2, b2);

    return result;
    // Complete this function
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a0 = in.nextInt();
    int a1 = in.nextInt();
    int a2 = in.nextInt();
    int b0 = in.nextInt();
    int b1 = in.nextInt();
    int b2 = in.nextInt();
    int[] result = solve(a0, a1, a2, b0, b1, b2);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
    }
    System.out.println("");
    in.close();

  }

}
