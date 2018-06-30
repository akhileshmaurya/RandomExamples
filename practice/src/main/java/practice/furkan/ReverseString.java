package practice.furkan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) throws Exception {
		X a= new X();
		Y b= new Y();
		Class o= b.getClass();
		System.out.println(o.isLocalClass());

	}

	public String test() {
		try {
			System.out.println("one");
			return "";
		} finally {
			System.out.println("one11");
		}
	}

}

class X{
	int a;
	double b;
}
class Y extends X{
	int c;
}
