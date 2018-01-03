package practice.hackerearth.bheema;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class AlexAndRequests {

	public static void main(String args[]) throws Exception {

		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int q = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		int maxNumber = Integer.MIN_VALUE, temp;
		for (int i = 0; i < q; i++) {
			temp = Integer.parseInt(br.readLine());
			if (queue.size() < N) {
				if (queue.peek() != null && queue.peek() < temp) {
					queue.poll();
				}
				queue.add(temp);
				if (temp > maxNumber) {
					maxNumber = temp;
				}
				System.out.println("YES");
			} else {
				if (queue.peek() < temp) {
					System.out.println("YES");
					queue.poll();
					queue.add(temp);
				} else {
					System.out.println("NO");
				}
			}
		}
	}

}
