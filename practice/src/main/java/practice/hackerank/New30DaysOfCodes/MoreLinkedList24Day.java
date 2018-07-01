package practice.hackerank.New30DaysOfCodes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

	@Override
	public String toString() {
		return "[" + data + ":" + next + "]";
	}

}

public class MoreLinkedList24Day {

	public static Node removeDuplicates(Node head) {
		if (head == null || head.next == null)
			return head;
		Node old = head;
		Set<Integer> setOfNumber = new HashSet<>();
		setOfNumber.add(head.data);
		Node tmp = head.next;

		while (tmp != null) {
			if (setOfNumber.contains(tmp.data)) {
				old.next = tmp.next;

			} else {
				setOfNumber.add(tmp.data);
				old = tmp;
			}
			//System.out.println(head + " :: " + tmp + " :: " + setOfNumber);

			tmp = tmp.next;

		}
		return head;

	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}
}
