package practice.furkan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] output = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			output[input.length() - 1 - i] = input.charAt(i);
		}
		System.out.println(String.valueOf(output));
	}

}
