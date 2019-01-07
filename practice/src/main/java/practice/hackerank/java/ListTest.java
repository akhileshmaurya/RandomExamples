
package practice.hackerank.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    List<Integer> list = new LinkedList<Integer>();
    for (int i = 0; i < n; i++) {
      list.add(scan.nextInt());

    }
    int Q = scan.nextInt();
    for (int i = 0; i < Q; i++) {
      String query = scan.next();
      if ("Insert".equalsIgnoreCase(query)) {
        int x = scan.nextInt();
        int y = scan.nextInt();
        list.add(x, y);
      } else {
        int x = scan.nextInt();
        list.remove(x);
      }
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    scan.close();
  }

}
