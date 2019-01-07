package practice.hackerank.New30DaysOfCodes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class NodeBST {
  NodeBST left, right;
  int data;

  NodeBST(int data) {
    this.data = data;
    left = right = null;
  }
}


public class LevelOrderTraversalBST {

  static void levelOrder(NodeBST root) {
    Queue<NodeBST> queue = new LinkedList<NodeBST>();
    queue.add(root);
    while (!queue.isEmpty()) {
      NodeBST tmp = queue.poll();
      if (tmp != null) {
        System.out.print(tmp.data + " ");
        if (tmp.left != null)
          queue.add(tmp.left);
        if (tmp.right != null)
          queue.add(tmp.right);
      }
    }

  }

  public static NodeBST insert(NodeBST root, int data) {
    if (root == null) {
      return new NodeBST(data);
    } else {
      NodeBST cur;
      if (data <= root.data) {
        cur = insert(root.left, data);
        root.left = cur;
      } else {
        cur = insert(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    NodeBST root = null;
    while (T-- > 0) {
      int data = sc.nextInt();
      root = insert(root, data);
    }
    levelOrder(root);
    sc.close();
  }
}
