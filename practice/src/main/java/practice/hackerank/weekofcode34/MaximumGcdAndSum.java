package practice.hackerank.weekofcode34;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

public class MaximumGcdAndSum {

  private static int gcd(int a, int b) {
    BigInteger b1 = BigInteger.valueOf(a);
    BigInteger b2 = BigInteger.valueOf(b);
    BigInteger gcd = b1.gcd(b2);
    return gcd.intValue();
  }

  static int maximumGcdAndSum(int[] A, int[] B, int m, int p) {
    // Complete this function
    int maxSum = Integer.MIN_VALUE, maxGcd = Integer.MIN_VALUE, gcd;
    Set<String> alreadyCalculated = new HashSet<String>();
    for (int i = 0; i < p; i++) {
      for (int j = 0; j < m; j++) {
        if (!(alreadyCalculated.contains(B[i] + ":" + A[j])
            || alreadyCalculated.contains(A[j] + ":" + B[i]))) {
          gcd = gcd(A[j], B[i]);
          alreadyCalculated.add(A[j] + ":" + B[i]);
          if (gcd > maxGcd) {
            maxGcd = gcd;
            maxSum = A[j] + B[i];
          } else if (gcd == maxGcd && (A[j] + B[i]) > maxSum) {
            maxSum = A[j] + B[i];
          }
        }
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {
    // initialize
    InputReader in = new InputReader(System.in);
    OutputWriter out = new OutputWriter(System.out);
    int n = in.readInt();
    int[] A = IOUtils.readIntArray(in, n);
    int[] B = IOUtils.readIntArray(in, n);
    int res = maximumGcdAndSum(A, B, n, n);
    out.printLine(res);
    // flush output
    out.flush();
    out.close();
  }

}


class InputReader {

  private InputStream stream;
  private byte[] buf = new byte[1024];
  private int curChar;
  private int numChars;
  private SpaceCharFilter filter;

  public InputReader(InputStream stream) {
    this.stream = stream;
  }

  public int read() {
    if (numChars == -1)
      throw new InputMismatchException();
    if (curChar >= numChars) {
      curChar = 0;
      try {
        numChars = stream.read(buf);
      } catch (IOException e) {
        throw new InputMismatchException();
      }
      if (numChars <= 0)
        return -1;
    }
    return buf[curChar++];
  }

  public int readInt() {
    int c = read();
    while (isSpaceChar(c))
      c = read();
    int sgn = 1;
    if (c == '-') {
      sgn = -1;
      c = read();
    }
    int res = 0;
    do {
      if (c < '0' || c > '9')
        throw new InputMismatchException();
      res *= 10;
      res += c - '0';
      c = read();
    } while (!isSpaceChar(c));
    return res * sgn;
  }

  public String readString() {
    int c = read();
    while (isSpaceChar(c))
      c = read();
    StringBuilder res = new StringBuilder();
    do {
      res.appendCodePoint(c);
      c = read();
    } while (!isSpaceChar(c));
    return res.toString();
  }

  public boolean isSpaceChar(int c) {
    if (filter != null)
      return filter.isSpaceChar(c);
    return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
  }

  public String next() {
    return readString();
  }

  public interface SpaceCharFilter {
    public boolean isSpaceChar(int ch);
  }
}


class OutputWriter {
  private final PrintWriter writer;

  public OutputWriter(OutputStream outputStream) {
    writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
  }

  public OutputWriter(Writer writer) {
    this.writer = new PrintWriter(writer);
  }

  public void print(Object... objects) {
    for (int i = 0; i < objects.length; i++) {
      if (i != 0)
        writer.print(' ');
      writer.print(objects[i]);
    }
  }

  public void printLine(Object... objects) {
    print(objects);
    writer.println();
  }

  public void close() {
    writer.close();
  }

  public void flush() {
    writer.flush();
  }

}


class IOUtils {

  public static int[] readIntArray(InputReader in, int size) {
    int[] array = new int[size];
    for (int i = 0; i < size; i++)
      array[i] = in.readInt();
    return array;
  }

}
