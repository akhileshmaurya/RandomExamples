package practice.spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class KhiataKha {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Long> set=new HashSet<Long>();
		//987654312678, 987898765678, 987896545674, 456789234576, 987896512307, 
		//987654888999, 999999993425.
		set.add(987654312678l);
		set.add(987898765678l);
		set.add(987896545674l);
		set.add(456789234576l);
		set.add(987896512307l);
		set.add(987654888999l);
		set.add(999999993425l);
		long t = Long.parseLong(br.readLine());
		for (int i = 0; i < t; i++) {
			long n = Long.parseLong(br.readLine());
			if(set.contains(n)){
				System.out.println("Special Number");
			}else{
				System.out.println("Just a number");
			}
		}
		
	}

}
