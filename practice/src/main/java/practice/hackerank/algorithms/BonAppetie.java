package practice.hackerank.algorithms;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/bon-appetit
public class BonAppetie {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    // k--;
    long sum = 0, v;
    for (long i = 0; i < n; i++) {
      v = sc.nextLong();
      if (i == k)
        continue;
      sum = sum + v;
    }

    long part = sc.nextLong();
    if ((sum / 2) == part) {
      System.out.println("Bon Appetit");
    } else {
      System.out.println(part - (sum / 2));
    }
    sc.close();

  }

}
