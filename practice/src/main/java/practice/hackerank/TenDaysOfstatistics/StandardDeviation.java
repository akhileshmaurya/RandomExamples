package practice.hackerank.TenDaysOfstatistics;

import java.util.Scanner;

public class StandardDeviation {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long elementsX[] = new long[n];
    long bigsum = 0;
    for (int i = 0; i < n; i++) {
      elementsX[i] = in.nextLong();
      bigsum += elementsX[i];

    }

    double mean = (double) bigsum / n;
    double sqrtSum = 0;
    for (int i = 0; i < n; i++) {
      sqrtSum += Math.pow(elementsX[i] - mean, 2);

    }
    double output = Math.sqrt((sqrtSum / n));
    System.out.printf("%.1f\n", output);
    in.close();

  }

}
