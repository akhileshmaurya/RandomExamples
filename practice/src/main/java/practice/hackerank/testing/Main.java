
package practice.hackerank.testing;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
  static InputStream is;
  static PrintWriter out;
  static String INPUT = "";

  static void solve() {
    int n = readInt();
    int[] a = readArray(n);
    int[] f = new int[1000001];
    for (int v : a) {
      for (int d = 1; d * d <= v; d++) {
        if (v % d == 0) {
          f[d]++;
          if (d * d < v)
            f[v / d]++;
        }
      }
    }
    long[] ret = new long[1000001];
    for (int i = 1000000; i >= 1; i--) {
      ret[i] = (long) f[i] * (f[i] - 1) * (f[i] - 2) / 6;
      for (int j = i * 2; j <= 1000000; j += i) {
        ret[i] -= ret[j];
      }
    }
    out.println(ret[1]);
  }

  public static void main(String[] args) throws Exception {

    long S = System.currentTimeMillis();
    is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
    out = new PrintWriter(System.out);

    solve();
    out.flush();
    long G = System.currentTimeMillis();
    tr(G - S + "ms");
  }

  public static boolean eof() {
    if (lenbuf == -1)
      return true;
    int lptr = ptrbuf;
    while (lptr < lenbuf)
      if (!isSpaceChar(inbuf[lptr++]))
        return false;

    try {
      is.mark(1000);
      while (true) {
        int b = is.read();
        if (b == -1) {
          is.reset();
          return true;
        } else if (!isSpaceChar(b)) {
          is.reset();
          return false;
        }
      }
    } catch (IOException e) {
      return true;
    }
  }

  private static byte[] inbuf = new byte[1024];
  static int lenbuf = 0, ptrbuf = 0;

  private static int readByte() {
    if (lenbuf == -1)
      throw new InputMismatchException();
    if (ptrbuf >= lenbuf) {
      ptrbuf = 0;
      try {
        lenbuf = is.read(inbuf);
      } catch (IOException e) {
        throw new InputMismatchException();
      }
      if (lenbuf <= 0)
        return -1;
    }
    return inbuf[ptrbuf++];
  }

  private static boolean isSpaceChar(int c) {
    return !(c >= 33 && c <= 126);
  }

  private static int skip() {
    int b;
    while ((b = readByte()) != -1 && isSpaceChar(b));
    return b;
  }

  public static double readDouble() {
    return Double.parseDouble(readString());
  }

  public static char readCharacter() {
    return (char) skip();
  }

  private static String readString() {
    int b = skip();
    StringBuilder sb = new StringBuilder();
    while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
                                // ')
      sb.appendCodePoint(b);
      b = readByte();
    }
    return sb.toString();
  }

  private static char[] readCharArray(int n) {
    char[] buf = new char[n];
    int b = skip(), p = 0;
    while (p < n && !(isSpaceChar(b))) {
      buf[p++] = (char) b;
      b = readByte();
    }
    return n == p ? buf : Arrays.copyOf(buf, p);
  }

  public static char[][] readMatrix(int n, int m) {
    char[][] map = new char[n][];
    for (int i = 0; i < n; i++)
      map[i] = readCharArray(m);
    return map;
  }

  private static int[] readArray(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = readInt();
    return a;
  }

  private static int readInt() {
    int num = 0, b;
    boolean minus = false;
    while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
    if (b == '-') {
      minus = true;
      b = readByte();
    }

    while (true) {
      if (b >= '0' && b <= '9') {
        num = num * 10 + (b - '0');
      } else {
        return minus ? -num : num;
      }
      b = readByte();
    }
  }

  public static long readLong() {
    long num = 0;
    int b;
    boolean minus = false;
    while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
    if (b == '-') {
      minus = true;
      b = readByte();
    }

    while (true) {
      if (b >= '0' && b <= '9') {
        num = num * 10 + (b - '0');
      } else {
        return minus ? -num : num;
      }
      b = readByte();
    }
  }

  private static void tr(Object... o) {
    if (INPUT.length() != 0)
      System.out.println(Arrays.deepToString(o));
  }
}
