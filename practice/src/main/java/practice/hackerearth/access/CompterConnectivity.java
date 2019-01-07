
package practice.hackerearth.access;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class CompterConnectivity {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < n; i++) {
      String[] ss = br.readLine().split(" ");
      map.put(ss[1], Integer.parseInt(ss[2]));
    }
    int q = Integer.parseInt(br.readLine());
    for (int i = 0; i < q; i++) {
      String[] ss = br.readLine().split(" ");
      int lat = Integer.parseInt(ss[2]);
      if (map.containsKey(ss[1]) && map.get(ss[1]) < lat) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }
    }
  }

  private static String getKey(String[] ss) {
    int first = Integer.parseInt(ss[0]);
    int second = Integer.parseInt(ss[1]);
    if (first < second) {
      return first + "_" + second;
    }
    return second + "_" + first;

  }
}
