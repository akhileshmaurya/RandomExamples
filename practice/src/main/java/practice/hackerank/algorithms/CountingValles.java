package practice.hackerank.algorithms;

import java.util.Scanner;

public class CountingValles {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int steps = in.nextInt();
    in.nextLine();
    String stepStatus = in.nextLine();
    System.out.println(steps + "::" + stepStatus);
    boolean isBelowSeaLevel = false;
    int levels = 0;
    int noOfValles = 0;
    for (int i = 0; i < steps; i++) {
      if ('U' == stepStatus.charAt(i))
        levels++;
      else
        levels--;
      if (levels < 0 && !isBelowSeaLevel) {
        noOfValles++;
        isBelowSeaLevel = true;
      }

      if (levels >= 0) {
        isBelowSeaLevel = false;
      }

    }
    System.out.println(noOfValles);
    in.close();
  }
}
