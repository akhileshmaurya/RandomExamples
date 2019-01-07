package practice.hackerank.algorithms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruction {

  static int stringConstruction(String s) {
    // Complete this function
    int uniq = 0;
    Set<Character> set = new HashSet<Character>();
    for (int i = 0; i < s.length(); i++) {
      if (!set.contains(s.charAt(i))) {
        uniq++;
        set.add(s.charAt(i));
      }

    }
    return uniq;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for (int a0 = 0; a0 < q; a0++) {
      String s = in.next();
      int result = stringConstruction(s);
      System.out.println(result);
      // in.close();
    }
    in.close();
  }

}
