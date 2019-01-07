package practice.furkan;

public class Array123Array {

  public static void main(String[] args) {
    System.out.println(is123Array(new int[] {1, 2, 3, 3, 2, 1}));
    System.out.println(is123Array(new int[] {0, 1, 2, 3, 1, 2, 3}));
    System.out.println(is123Array(new int[] {1, 2, 3, 3, 2, 1, 1, 2, 3}));
    System.out.println(is123Array(new int[] {1, 2, 3}));
    System.out.println(is123Array(new int[] {}));
  }

  public static int is123Array(int a[]) {
    int is123Array = 0;
    boolean mitchmatch = false;
    if (a.length % 3 == 0) {
      for (int i = 0; i < a.length;) {
        if (a[i] != 1 || a[i + 1] != 2 || a[i + 2] != 3) {
          mitchmatch = true;
          break;
        } else {
          is123Array = 1;
        }
        i = i + 3;
      }
    }
    if (mitchmatch)
      is123Array = 0;
    return is123Array;
  }

}
