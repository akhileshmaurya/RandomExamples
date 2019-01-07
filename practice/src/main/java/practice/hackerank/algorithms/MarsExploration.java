package practice.hackerank.algorithms;

import java.util.Scanner;

public class MarsExploration {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String SOS = in.next();
    int alteredNumbers = 0;
    for (int i = 0; i < SOS.length();) {
      if (SOS.charAt(i) != 'S') {
        alteredNumbers++;
      }
      if (SOS.charAt(i + 1) != 'O') {
        alteredNumbers++;
      }
      if (SOS.charAt(i + 2) != 'S') {
        alteredNumbers++;
      }

      i = i + 3;
    }
    System.out.println(alteredNumbers);
    in.close();
  }

}
