package practice.spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// http://www.spoj.com/problems/SEUG/
public class SheethaUniqGame {

  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Quicksort sorter = new Quicksort();
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      String[] input = br.readLine().trim().split(" ");
      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);
      int h = Integer.parseInt(input[2]);
      int w = Integer.parseInt(input[3]);
      int n = Integer.parseInt(br.readLine());
      int[] inputNumbers = convertStringToNumber(br.readLine().trim().split(" "));
      sorter.sort(inputNumbers);
      int numberOfStone = 1;
      int rw = h - w;
      int weight = inputNumbers[n - 1];
      for (int j = n - 2; j >= 0; j--) {
        if (rw < weight) {
          break;
        }
        weight = weight + inputNumbers[j];
        numberOfStone++;
      }
      System.out.println(numberOfStone);
    }
  }

  private static int[] convertStringToNumber(String[] split) {
    int[] inputNumbers = new int[split.length];
    int i = 0;
    for (String string : split) {
      inputNumbers[i++] = Integer.parseInt(string.trim());
    }
    return inputNumbers;
  }

}


class Quicksort {
  private int[] numbers;
  private int number;

  public void sort(int[] values) {
    if (values == null || values.length == 0) {
      return;
    }
    this.numbers = values;
    number = values.length;
    quicksort(0, number - 1);
  }

  private void quicksort(int low, int high) {
    int i = low, j = high;

    int pivot = numbers[low + (high - low) / 2];

    while (i <= j) {

      while (numbers[i] < pivot) {
        i++;
      }

      while (numbers[j] > pivot) {
        j--;
      }

      if (i <= j) {
        exchange(i, j);
        i++;
        j--;
      }
    }
    // Recursion
    if (low < j)
      quicksort(low, j);
    if (i < high)
      quicksort(i, high);
  }

  private void exchange(int i, int j) {
    int temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }
}
