package practice.hackerank.algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class XorMagicNew {

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String in[] = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    String input[] = br.readLine().split(" ");
    int[] arr = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }
    long m = Long.parseLong(in[1]);
    findByBriutForce(arr, m, n);
    System.out.println();
    findMthRow(arr, m);

  }

  private static void findByBriutForce(int[] arr, long m, int n) {
    int temp[] = new int[arr.length];
    for (int i = 0; i < n; i++) {
      temp[i] = arr[i];
    }
    for (int i = 0; i < m - 1; i++) {
      int k = temp[0];
      for (int j = 0; j < n; j++) {
        if (j < n - 1)
          temp[j] = temp[j] ^ temp[j + 1];
        else
          temp[j] = temp[j] ^ k;
        // System.out.print(temp[j] + " ");
      }
      // System.out.println();
    }
    System.out.println("Final row is ");
    for (int i = 0; i < n; i++) {
      System.out.print(temp[i] + " ");
    }
  }

  private static void findMthRow(int[] arr, long m) {
    if (arr.length == 1) {
      for (int i = 0; i < arr.length; i++)
        System.out.print(arr[0]);
    } else {
      int k;
      if (m > arr.length)
        k = arr.length;
      else
        k = (int) m;
      boolean status[] = new boolean[k];
      // System.out.println("1:");
      makingBooleanArry(m, status);
      // System.out.println("2:");
      for (int i = 0; i < arr.length; i++) {
        // System.out.println("3:");
        long value = 0;
        for (int j = 0; j < k; j++) {
          // System.out.println("4:");
          int p = i + j;
          while (p >= arr.length)
            p = p - arr.length;
          if (status[j])
            value = value ^ arr[p];

        }
        System.out.print(value + " ");
      }
    }
  }

  private static void makingBooleanArry(long row, boolean[] status) {
    long i, limit, l;
    limit = row;
    BigInteger previous = new BigInteger("1");
    status[0] = true;
    boolean isAllow = false;
    for (i = 1; i < limit; i++) {
      // System.out.println("b1:");
      isAllow = false;
      previous = (previous.multiply(new BigInteger(String.valueOf((row - i)))))
          .divide(new BigInteger(String.valueOf(i)));

      if (previous.mod(new BigInteger("2")).intValue() != 0)
        isAllow = true;
      l = i;
      while (l >= status.length) {
        l = l - status.length;
        // System.out.println("b2:");
      }
      if (status[(int) l] == isAllow)
        status[(int) l] = false;
      else
        status[(int) l] = true;

    }
  }

  private static void pascaln(int row) {
    int i, limit;
    if (row < 0)
      System.out.println("\nInvalid Input\n");
    else {
      limit = row >> 1;
      if (row % 2 != 0)
        limit++;
      int arr[] = new int[limit];
      arr[0] = 1;
      for (i = 1; i < limit; i++)
        arr[i] = (arr[i - 1] * (row - i)) / i;
      System.out.print("\n");
      for (i = 0; i < limit; i++)
        System.out.print(arr[i] + " ");
      if (row % 2 != 0)
        limit--;
      for (i = --limit; i >= 0; i--)
        System.out.print(arr[i] + " ");
      System.out.print("\n");
    }
  }

  public static void main1111(String[] args) {
    int k = 10;
    boolean status[] = new boolean[k];
    pascaln(k);
    makingBooleanArry(k, status);
    System.out.print("\n");
    for (int i = 0; i < status.length; i++) {
      System.out.print(status[i] + " ");
    }

  }

}
