package practice.hackerrank.cisco;

public class Problem1 extends MyProb {

	public int my = 5;
	public int test11;	

	public int getMy() {
		return my;
	}

	public void setMy(int my) {
		this.my = my;
	}

	public void test() {
		System.out.println("Test myProb3 :" + my);
	}

	public static void main(String[] args) {
		MyProb p1 = new Problem1();
		p1.my=13;
		p1.test();
		System.out.println("Test myProb2 :" + p1.my);
	}

}

class MyProb {

	public int my = 20;

	public void test() {
		System.out.println("Test myProb1 :" + my);
	}

}
