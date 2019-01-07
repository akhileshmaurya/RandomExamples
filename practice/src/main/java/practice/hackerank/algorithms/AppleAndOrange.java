package practice.hackerank.algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppleAndOrange {

  public static void main(String[] args) throws Exception {
    long s, t, a, b, m, n, temp;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input[] = br.readLine().split(" ");
    s = Long.parseLong(input[0]);
    t = Long.parseLong(input[1]);
    input = br.readLine().split(" ");
    a = Long.parseLong(input[0]);
    b = Long.parseLong(input[1]);
    input = br.readLine().split(" ");
    m = Long.parseLong(input[0]);
    n = Long.parseLong(input[1]);
    String[] distA = br.readLine().split(" ");
    String[] distB = br.readLine().split(" ");
    long countA = 0;
    for (int i = 0; i < m; i++) {
      temp = Long.parseLong(distA[i]) + a;
      if (temp >= s && temp <= t)
        countA++;
    }
    long countB = 0;
    for (int i = 0; i < n; i++) {
      temp = Long.parseLong(distB[i]) + b;
      if (temp >= s && temp <= t)
        countB++;
    }
    System.out.println(countA);
    System.out.println(countB);
  }

}
