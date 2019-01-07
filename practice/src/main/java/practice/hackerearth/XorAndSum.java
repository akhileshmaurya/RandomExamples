package practice.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class XorAndSum {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int t=Integer.parseInt(br.readLine());

    int a = 1, b = 20, x = 60;
    // for ( x = a; x <= b; x++) {
    System.out.println();
    System.out.println("**********************");
    System.out.println();
    String input = Integer.toBinaryString(x);
    System.out.println(input);
    for (int i = 1; i < x; i++) {
      if ((x + i) == (x ^ i)) {

        printUpToTrellingZero(Integer.toBinaryString(i), input.length());
      }

    }
    // }

  }

  private static void printUpToTrellingZero(String binaryString, int length) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < length - binaryString.length(); i++) {
      sb.append("0");
    }
    System.out.println(sb.toString() + binaryString);
  }

}
