package practice.hackerank.TenDaysOfstatistics;

import java.util.Arrays;
import java.util.Scanner;

public class InterquartileRange {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), totalFrequency = 0;
    Pair elements[] = new Pair[n];
    for (int i = 0; i < n; i++) {
      elements[i] = new Pair();
      elements[i].setElement(in.nextInt());
    }
    for (int i = 0; i < n; i++) {
      // elements[0][i] = in.nextLong();
      elements[i].setFrequency(in.nextInt());
      totalFrequency += elements[i].getFrequency();
    }
    Arrays.sort(elements);
    // System.out.println(Arrays.toString(elements));
    double q1, q3;
    // double q2 = median(elements, 0, totalFrequency - 1);
    if (n % 2 != 0) {
      q1 = median(elements, 0, (totalFrequency / 2) - 1);
      q3 = median(elements, (totalFrequency / 2 + 1), totalFrequency - 1);
    } else {
      q1 = median(elements, 0, (totalFrequency / 2) - 1);
      q3 = median(elements, totalFrequency / 2, totalFrequency - 1);
    }
    // System.out.printf("%.0f\n%.0f\n%.0f\n", q1, q2, q3);
    double out = (double) (q3 - q1);
    System.out.printf("%.1f\n", out);
    in.close();
  }

  private static double median(Pair[] elements, int start, int end) {
    int size = end - start + 1;
    double result = 0l;
    int index = (end + start) / 2;
    // System.out.println("start :" + start + ", end:" + end + ", size :" +
    // size + ", index :" + index);
    if (size % 2 != 0) {
      result = (double) getValueFromIndex(elements, index);
    } else {
      result =
          (double) (getValueFromIndex(elements, index) + getValueFromIndex(elements, index + 1))
              / 2;

    }
    return result;
  }

  private static double getValueFromIndex(Pair[] elements, int index) {
    int indexSum = 0, result = 0;
    boolean found = false;
    for (int i = 0; i < elements.length; i++) {
      if (indexSum > index) {
        result = elements[i - 1].getElement();
        found = true;
        break;
      }
      indexSum += elements[i].getFrequency();

    }
    if (!found) {
      result = elements[elements.length - 1].getElement();
    }
    return result;
  }

}


class Pair implements Comparable<Pair> {
  int element;
  int frequency;

  public int getElement() {
    return element;
  }

  public void setElement(int element) {
    this.element = element;
  }

  public int getFrequency() {
    return frequency;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  @Override
  public String toString() {
    return "Pair [element=" + element + ", frequency=" + frequency + "]";
  }

  public int compareTo(Pair o) {

    return this.element - o.element;
  }

}
