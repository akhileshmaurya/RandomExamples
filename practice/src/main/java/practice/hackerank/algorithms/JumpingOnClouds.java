package practice.hackerank.algorithms;

import java.util.Scanner;

public class JumpingOnClouds {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int c[] = new int[n];
    for (int c_i = 0; c_i < n; c_i++) {
      c[c_i] = in.nextInt();
    }
    int i = 0;
    int jumps = 0;
    for (; i < c.length;) {
      // System.out.println("cloud :: " + i);
      if ((i + 2) < c.length && c[i + 2] != 1) {
        i = i + 2;
      } else {
        i++;
      }
      jumps++;
    }
    System.out.println(--jumps);
    in.close();
  }
}
