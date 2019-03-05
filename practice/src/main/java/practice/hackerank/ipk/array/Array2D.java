
package practice.hackerank.ipk.array;

import java.io.IOException;
import java.util.Scanner;

public class Array2D {

  static int hourglassSum(int[][] arr) {
    int maxResult = Integer.MIN_VALUE;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        int hourResultSum = getGlassSum(arr, i, j);
        if (hourResultSum > maxResult) {
          maxResult = hourResultSum;
        }
      }
    }
    return maxResult;
  }

  private static int getGlassSum(int[][] arr, int i, int j) {
    return arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
        + arr[i + 2][j + 1] + arr[i + 2][j + 2];
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    int[][] arr = new int[6][6];

    for (int i = 0; i < 6; i++) {
      String[] arrRowItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      for (int j = 0; j < 6; j++) {
        int arrItem = Integer.parseInt(arrRowItems[j]);
        arr[i][j] = arrItem;
      }
    }

    int result = hourglassSum(arr);

    System.out.println("Result :" + result);

    scanner.close();
  }
}
