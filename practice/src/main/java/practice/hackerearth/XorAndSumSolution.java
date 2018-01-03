package practice.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class XorAndSumSolution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int x, count;
		while (t > 0) {
			x = Integer.parseInt(br.readLine());
			count = 0;
			while (x % 2 != 1) {
				x = x / 2;
				count++;
			}
			System.out.println((int) Math.pow(2, count) - 1);
			t--;
		}
	}

}
