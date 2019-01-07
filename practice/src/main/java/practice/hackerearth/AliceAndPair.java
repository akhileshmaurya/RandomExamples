package practice.hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AliceAndPair {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n, count, t;
    t = sc.nextLong();
    while (t > 0) {
      count = 0;
      n = sc.nextLong();
      List<Long> factors = allFactors(n);
      for (Long fact : factors) {
        if (gcd_recursive(fact, n / fact) == 1)
          count = count + 2;
      }
      System.out.println(count);
    }
    sc.close();
  }

  private static List<Long> allFactors(long n) {
    ArrayList<Long> factors = new ArrayList<Long>();
    long i = 1;
    while (i <= Math.sqrt(n)) {
      if (n % i == 0) {
        factors.add(i);
      }

      i++;
    }
    return factors;
  }

  static long gcd_recursive(Long a, long b) {
    if (b > 0)
      return gcd_recursive(b, a % b);
    else
      return a;
  }
}
