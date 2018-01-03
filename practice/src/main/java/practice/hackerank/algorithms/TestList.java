package practice.hackerank.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class TestList {

	static int max = 1;

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("vgh");
		list.add("jhj");
		list.add("jjk");
		list.add("bhj");
		long startTime = System.nanoTime();
		for (int i = 0; i < max; i++) {
			System.out.println(list.toString());

		}
		System.out.println("Total time1: " + (double) (System.nanoTime() - startTime) / 1000000);
		startTime = System.nanoTime();
		for (int i = 0; i < max; i++) {
			System.out.println(string(list));

		}
		System.out.println("Total time2: " + (double) (System.nanoTime() - startTime) / 1000000);
		startTime = System.nanoTime();
		for (int i = 0; i < max; i++) {
			System.out.println(string1(list));

		}
		System.out.println("Total time3: " + (double) (System.nanoTime() - startTime) / 1000000);

	}

	private static String string(List<String> list) {
		return StringUtils.join(list, ",");

	}

	private static String string1(List<String> list) {
		int i=0;
		StringBuffer sb = new StringBuffer();
		for ( i = 0; i < list.size()-1; i++) {
			sb.append(list.get(i)+",");
			
		}
		sb.append(list.get(i));
		return sb.toString();
	}

}
