package practice.hackerank.algorithms;

import java.util.Scanner;
import java.util.Stack;

public class ReduceString {

  static String super_reduced_string(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.toCharArray().length; i++) {
      if (stack.size() > 0 && s.charAt(i) == stack.peek()) {
        stack.pop();
      } else {
        stack.push(s.charAt(i));
      }
    }
    StringBuffer sb = new StringBuffer();
    for (Character character : stack) {
      sb.append(character);
    }
    if (sb.length() > 0)
      return sb.toString();
    else
      return "Empty String";

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String result = super_reduced_string(s);
    System.out.println(result);
    in.close();
  }

}
