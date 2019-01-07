package practice.hackerank.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MigratoryBirds {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = Integer.MIN_VALUE;
    int birdId = Integer.MAX_VALUE;
    int ele;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int ar_i = 0; ar_i < n; ar_i++) {
      ele = in.nextInt();
      if (map.containsKey(ele)) {
        map.put(ele, (map.get(ele) + 1));
      } else {
        map.put(ele, 1);
      }
    }
    for (Entry<Integer, Integer> bird : map.entrySet()) {
      if (result < bird.getValue()) {
        result = bird.getValue();
        birdId = bird.getKey();
      } else if (result == bird.getValue() && birdId > bird.getKey()) {
        birdId = bird.getKey();
      }

    }

    System.out.println(birdId);
    in.close();
  }

}
