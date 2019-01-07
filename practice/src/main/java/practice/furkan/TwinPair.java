package practice.furkan;

public class TwinPair {

  public static void main(String[] args) {
    System.out.println(isTwinPaired(new int[] {2, 4, 32}));
    System.out.println(isTwinPaired(new int[] {1, 1, 1}));
    System.out.println(isTwinPaired(new int[] {1, 19, 23}));
    System.out.println(isTwinPaired(new int[] {1, 2, 2, 1}));
    System.out.println(isTwinPaired(new int[] {8}));
    System.out.println(isTwinPaired(new int[] {17}));
    System.out.println(isTwinPaired(new int[] {}));
  }

  public static int isTwinPaired(int a[]) {
    if (a.length <= 1)
      return 1;
    boolean isOddInc = true;
    boolean isEvenInc = true;
    Integer lastOdd = null;
    Integer lastEven = null;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        if (lastEven != null && lastEven > a[i]) {
          isEvenInc = false;
        }
        lastEven = a[i];
      } else {
        if (lastOdd != null && lastOdd > a[i]) {
          isOddInc = false;
        }
        lastOdd = a[i];
      }
      if (!isOddInc || !isEvenInc) {
        break;
      }
    }
    return (isOddInc && isEvenInc) ? 1 : 0;
  }

}
