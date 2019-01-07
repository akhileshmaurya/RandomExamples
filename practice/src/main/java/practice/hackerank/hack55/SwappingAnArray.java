
package practice.hackerank.hack55;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import javafx.util.Pair;

public class SwappingAnArray {

  // Complete the swapToSort function below.
  static int swapToSort(int[] a) {
    int n = a.length;
    ArrayList<Pair<Integer, Integer>> arrpos = new ArrayList<Pair<Integer, Integer>>();
    for (int i = 0; i < n; i++)
      arrpos.add(new Pair<Integer, Integer>(a[i], i));

    arrpos.sort(new Comparator<Pair<Integer, Integer>>() {
      public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        if (o1.getKey() > o2.getKey())
          return 1;

        else if (o1.getKey().equals(o2.getKey()))
          return 0;

        else
          return -1;
      }
    });

    Boolean[] vis = new Boolean[n];
    Arrays.fill(vis, false);

    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (vis[i] || arrpos.get(i).getValue() == i)
        continue;

      int cycle_size = 0;
      int j = i;
      while (!vis[j]) {
        vis[j] = true;
        j = arrpos.get(j).getValue();
        cycle_size++;
      }
      ans += (cycle_size - 1);
      if (ans > 1) {
        ans = -1;
        break;
      }
    }
    return ans;
  }

  public static void main(String[] args) throws IOException {
    // int[] a = { 6, 2, 4, 3, 5, 1, 7 };
    int[] a = {1, 10, 3, 4, 3};

    System.out.println(swapToSort(a));
  }
}
