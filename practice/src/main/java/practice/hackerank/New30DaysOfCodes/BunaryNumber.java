package practice.hackerank.New30DaysOfCodes;

import java.util.Scanner;

public class BunaryNumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int maximumConsicutive1 = 0, max = Integer.MIN_VALUE, a;

    while (n > 0) {
      a = n % 2;
      // System.out.println("a :" + a);
      if (a == 1) {
        maximumConsicutive1++;
      } else {
        if (max < maximumConsicutive1)
          max = maximumConsicutive1;
        maximumConsicutive1 = 0;
      }
      n = n / 2;
    }
    if (max < maximumConsicutive1)
      max = maximumConsicutive1;
    System.out.println(max);
    // System.out.println(Math.pow(2, max - 1));
    in.close();
  }

}
