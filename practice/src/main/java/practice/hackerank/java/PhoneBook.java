
package practice.hackerank.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

  public static void main(String[] argh) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.nextLine();
    Map<String, Integer> book = new HashMap<String, Integer>();
    for (int i = 0; i < n; i++) {
      String name = in.nextLine();
      int phone = in.nextInt();
      book.put(name, phone);
      in.nextLine();
    }
    while (in.hasNext()) {
      String s = in.nextLine();
      if (book.containsKey(s))
        System.out.println(s + "=" + book.get(s));
      else
        System.out.println("Not Found");
    }
    in.close();
  }
}
