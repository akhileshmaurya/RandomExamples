package practice.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DAG {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = br.readLine().trim().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		int q = Integer.parseInt(input1[2]);
		int u, v;
		Map<Integer, GraphNode> allnodes = new HashMap<Integer, GraphNode>();
		for (int i = 0; i < m; i++) {
			String[] input2 = br.readLine().trim().split(" ");
			u = Integer.parseInt(input2[0]);
			v = Integer.parseInt(input2[1]);

			if (!allnodes.containsKey(u)) {
				allnodes.put(u, new GraphNode());
			}
			if (!allnodes.containsKey(v)) {
				allnodes.put(v, new GraphNode());
			}
			addChildAndParent(allnodes, u, v);

		}
		//System.out.println();
		//printMap(allnodes);
		// System.out.println("\n n:" + n + ", m :" + m + " , q : " + q);
		for (int i = 0; i < q; i++) {
			String[] input3 = br.readLine().trim().split(" ");
			//System.out.println("Query Input is :i" + i + " :: " + Arrays.toString(input3));
			// printMap(allnodes);
			switch (input3[0].trim()) {
			case "1":
				long x = Long.parseLong(input3[2]);
				allnodes.get(Integer.parseInt(input3[1])).value = x;
				for (Integer child : allnodes.get(Integer.parseInt(input3[1])).childs) {
					allnodes.get(child).value = x;
				}
				break;
			case "2":
				long x1 = Long.parseLong(input3[2]);
				if (allnodes.get(Integer.parseInt(input3[1])).value > x1)
					allnodes.get(Integer.parseInt(input3[1])).value = x1;
				for (Integer child : allnodes.get(Integer.parseInt(input3[1])).childs) {
					if (allnodes.get(child).value > Long.parseLong(input3[2]))
						allnodes.get(child).value = x1;
				}
				break;

			case "3":
				System.out.println( allnodes.get(Integer.parseInt(input3[1])).value);
				break;
			}
			//printMap(allnodes);

		}

	}

	private static void addChildAndParent(Map<Integer, GraphNode> allnodes, int u, int v) {
		allnodes.get(u).childs.add(v);
		allnodes.get(v).parents.add(u);
		for (Integer el : allnodes.get(u).parents) {
			allnodes.get(el).childs.add(v);
		}
		for (Integer el : allnodes.get(v).childs) {
			allnodes.get(el).parents.add(u);
		}

	}

	private static void printMap(Map<Integer, GraphNode> allnodes) {
		for (Entry<Integer, GraphNode> el : allnodes.entrySet()) {
			System.out.println(el.getKey() + "  :: " + el.getValue());
		}

	}

}

class GraphNode {
	long value = 0;
	Set<Integer> parents = new HashSet<Integer>();
	Set<Integer> childs = new HashSet<Integer>();

	@Override
	public String toString() {
		return "GraphNode [value=" + value + ", parents=" + parents + ", childs=" + childs + "]";
	}

}