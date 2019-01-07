package practice.hackerank.TenDaysOfstatistics;

import java.util.Scanner;

public class PoisionDistribution2 {

  // Poision distribution formula
  // P(k,lamda)=lamda.pow(k)*e.pow(lamda)/factorial(k)
  // For beginners in statistics: an explanation of why "X²" is replaced
  // by "mean(X) + mean(X)²" when calculated the expected daily cost.

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double A = in.nextDouble();
    double B = in.nextDouble();
    // CA=160+40*X**2 , CB=128+40*Y**2
    double CA = 160 + 40 * (A + (A * A));
    double CB = 128 + 40 * (B + (B * B));
    System.out.printf("%.3f\n", CA);
    System.out.printf("%.3f\n", CB);
    in.close();
  }

}
