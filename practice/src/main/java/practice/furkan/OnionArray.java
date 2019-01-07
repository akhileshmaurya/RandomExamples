package practice.furkan;

public class OnionArray {

  public static void main(String[] args) {
    System.out.println(isOnionArray(new int[] {1, 2, 19, 4, 5}));
    System.out.println(isOnionArray(new int[] {1, 2, 3, 4, 15}));
    System.out.println(isOnionArray(new int[] {1, 3, 9, 8}));
    System.out.println(isOnionArray(new int[] {2}));
    System.out.println(isOnionArray(new int[] {}));
    System.out.println(isOnionArray(new int[] {-2, 5, 0, 5, 12}));
  }

  public static int isOnionArray(int a[]) {
    if (a.length <= 1)
      return 1;

    int isOnionArray = 0;
    boolean mitchmatch = false;

    for (int i = 0; i < a.length / 2; i++) {
      if ((a[i] + a[a.length - 1 - i]) > 10) {
        mitchmatch = true;
        break;
      } else {
        isOnionArray = 1;
      }

    }
    if (mitchmatch)
      isOnionArray = 0;

    return isOnionArray;
  }

}
