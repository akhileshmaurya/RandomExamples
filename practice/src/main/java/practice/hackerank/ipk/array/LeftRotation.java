package practice.hackerank.ipk.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftRotation {

  // Complete the rotLeft function below.
  static int[] rotLeft(int[] a, int d) {
    if (d == a.length) {
      return a;
    }
    int[] rot = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      int newIndex = (i + d) % a.length;
      rot[i] = a[newIndex];
    }
    return rot;
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] nd = br.readLine().split(" ");

    int n = Integer.parseInt(nd[0]);

    int d = Integer.parseInt(nd[1]);

    int[] a = new int[n];
    String[] aItems = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      int aItem = Integer.parseInt(aItems[i]);
      a[i] = aItem;
    }

    int[] result = rotLeft(a, d);

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

    br.close();
  }
}
