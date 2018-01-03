package practice.hackerearth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LockImpl implements Lock {
	private static volatile boolean lockAck = false;

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(new Integer(0));
		obj.add(new Integer(6));
		obj.add(new Integer(0));
		obj.removeAll(obj);
		boolean x = false;
		System.out.println(obj.isEmpty());

	}

	@Override
	public void acquire() {

		TreeMap<Integer, Integer> t = new TreeMap<Integer, Integer>();

		Map<String, String> m = new HashMap<String, String>();
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub

	}

}

interface Lock {

	public void acquire();

	public void release();

}