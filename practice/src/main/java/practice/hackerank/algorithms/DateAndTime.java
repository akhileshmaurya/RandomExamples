
package practice.hackerank.algorithms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateAndTime {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next();
    System.out.println(getDay(day, month, year));
    in.close();
  }

  @SuppressWarnings("deprecation")
  private static String getDay(String day, String month, String year) {
    Date date =
        new Date(Integer.parseInt(year) - 1900, Integer.parseInt(month) - 1, Integer.parseInt(day));
    // System.out.println(date);
    return new SimpleDateFormat("EEEE").format(date);
  }

}
