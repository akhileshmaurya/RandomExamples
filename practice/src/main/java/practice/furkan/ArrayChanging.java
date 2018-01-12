package practice.furkan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayChanging {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int j = 0; j < t; j++) {
			int n = Integer.parseInt(br.readLine());
			String[] arr = br.readLine().trim().split(" ");
			int x = Integer.parseInt(br.readLine());
			int count = 0, ele;
			for (int i = 0; i < n; i++) {
				ele = Integer.parseInt(arr[i]);
				if (ele == x) {
					count++;
				}
			}
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < arr.length; i++) {
				if (i < count)
					sb.append("1 ");
			}
			for (int i = 0; i < arr.length; i++) {
				ele = Integer.parseInt(arr[i]);
				if (ele != x)
					sb.append(arr[i] + " ");
			}
			System.out.println(sb.toString().trim());
		}
	}
}
