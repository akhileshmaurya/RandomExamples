package practice.hackerank.New30DaysOfCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NestedLogic26Day {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String givenDate[] = br.readLine().trim().split(" ");
		String expectedDate[] = br.readLine().trim().split(" ");
		int fine = 0;
		int givenYear = Integer.parseInt(givenDate[2]);
		int givenMonth = Integer.parseInt(givenDate[1]);
		int givenDay = Integer.parseInt(givenDate[0]);
		int expYear = Integer.parseInt(expectedDate[2]);
		int expMonth = Integer.parseInt(expectedDate[1]);
		int expDay = Integer.parseInt(expectedDate[0]);
		if (givenYear > expYear) {
			fine = 10000;
		} else if ((givenYear == expYear) && (givenMonth > expMonth)) {
			fine = 500 * (givenMonth - expMonth);
		} else if ((givenYear == expYear) && (givenMonth == expMonth) && (givenDay > expDay)) {
			fine = 15 * (givenDay - expDay);
		} else {
			fine = 0;
		}
		System.out.println(fine);
	}

}
