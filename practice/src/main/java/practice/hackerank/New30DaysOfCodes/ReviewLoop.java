package practice.hackerank.New30DaysOfCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReviewLoop {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for (int j = 0; j < n; j++) {

      String ss = br.readLine();
      StringBuffer sb1 = new StringBuffer();
      StringBuffer sb2 = new StringBuffer();
      for (int i = 0; i < ss.length(); i++) {
        if (i % 2 == 0)
          sb1.append(ss.charAt(i));
        else
          sb2.append(ss.charAt(i));

      }
      System.out.println(sb1.toString() + " " + sb2.toString());
    }
    br.close();
  }
}
