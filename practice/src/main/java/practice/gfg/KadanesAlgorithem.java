package practice.gfg;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
public class KadanesAlgorithem {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      int[] inputNumbers = convertStringToNumber(br.readLine().trim().split(" "));
      int globalMax = inputNumbers[0];
      int localMax = globalMax;
      for (int j = 1; j < n; j++) {
        localMax = Math.max(inputNumbers[j], localMax + inputNumbers[j]);
        globalMax = Math.max(globalMax, localMax);
      }
      System.out.println(globalMax);
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
