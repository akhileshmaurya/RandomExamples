package practice.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoodString {

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stubi

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    String s;
    int firstindex, lastIndex, k, mainIndex = -1;
    Integer[][] freq = new Integer[2][26];
    for (int i = 0; i < t; i++) {
      s = br.readLine();
      cleanArray(freq);
      k = s.length() - 1;
      mainIndex = -1;
      for (int j = 0; j <= s.length() / 2; j++) {
        if (j == k)
          continue;
        firstindex = s.charAt(j) - 'a';
        lastIndex = s.charAt(k) - 'a';
        // System.out.println("i:" + i + ", j:" + j + ",k:" + k + " , f:" + firstindex + " ,l:" +
        // lastIndex);
        if (freq[0][firstindex] == Integer.MAX_VALUE)
          freq[0][firstindex] = j;
        if (freq[1][lastIndex] == Integer.MIN_VALUE)
          freq[1][lastIndex] = k;
        if (freq[0][firstindex] != Integer.MAX_VALUE && freq[1][firstindex] != Integer.MIN_VALUE) {
          mainIndex = firstindex;
          break;
        } else if (freq[0][lastIndex] != Integer.MAX_VALUE
            && freq[1][lastIndex] != Integer.MIN_VALUE) {
          mainIndex = lastIndex;
          break;
        }
        k--;
      }

      if (mainIndex == -1)
        System.out.println(-1);
      else {
        System.out.println((freq[0][mainIndex] - 0 + s.length() - 1 - freq[1][mainIndex]));
      }

    }

  }

  private static void cleanArray(Integer[][] freq) {
    for (int i = 0; i < freq[0].length; i++) {
      freq[0][i] = Integer.MAX_VALUE;
      freq[1][i] = Integer.MIN_VALUE;

    }

  }

}
