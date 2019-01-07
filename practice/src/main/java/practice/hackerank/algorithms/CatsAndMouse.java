package practice.hackerank.algorithms;

import java.util.Scanner;

public class CatsAndMouse {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for (int a0 = 0; a0 < q; a0++) {
      int x = in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();

      int disX = getDistance(x, z);
      int disY = getDistance(y, z);
      if (disX < disY) {
        System.out.println("Cat A");
      } else if (disX > disY) {
        System.out.println("Cat B");
      } else {
        System.out.println("Mouse C");
      }

    }
    in.close();
  }

  private static int getDistance(int i, int j) {
    int dist = i - j;
    if (dist < 0)
      dist = dist * (-1);
    return dist;
  }

}
