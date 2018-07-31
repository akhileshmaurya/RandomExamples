package practice.hackerank.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/strong-password/problem
public class StrongPassword {
	// Complete the minimumNumber function below.
	static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		String specialCharacter = "!@#$%^&*()-+";
		boolean[] status = { false, false, false, false };// isNumber, isSmall,iSCappital, isSpecialCharacter
		int add = 0;
		for (char c : password.toCharArray()) {
			if (!status[0] && c >= '0' && c <= '9') {

				status[0] = true;
			} else if (!status[1] && c >= 'a' && c <= 'z') {

				status[1] = true;
			} else if (!status[2] && c >= 'A' && c <= 'Z') {

				status[2] = true;
			}
			if (!status[3] && specialCharacter.contains(String.valueOf(c))) {

				status[3] = true;
			}
			// System.out.println(c+"::"+add);
		}
		for (boolean b : status) {
			if (!b)
				add++;
		}
		if ((add + n) < 6) {
			add += (6 - add - n);
		}
		//System.out.println("add :" + add);
		return add;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String password = scanner.nextLine();

		int answer = minimumNumber(n, password);

		System.out.println(answer);

		scanner.close();
	}

}
