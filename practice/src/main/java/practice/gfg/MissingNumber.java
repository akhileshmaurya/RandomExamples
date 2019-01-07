package practice.gfg;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/missing-number-in-array/0
public class MissingNumber {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      int[] inputNumbers = convertStringToNumber(br.readLine().trim().split(" "));
      int globalSum = 0;
      for (int j = 0; j < n - 1; j++) {
        globalSum = globalSum + inputNumbers[j];
      }
      int actualSum = n * (n + 1) / 2;
      System.out.println(actualSum - globalSum);
    }

  }

  private static int[] convertStringToNumber(String[] split) {
    int[] inputNumbers = new int[split.length];
    int i = 0;
    for (String string : split) {
      inputNumbers[i++] = Integer.parseInt(string.trim());
    }
    return inputNumbers;
  }

}
