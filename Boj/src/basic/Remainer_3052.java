package basic;

import java.util.HashSet;
import java.util.Scanner;

public class Remainer_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];
		for (int i = 0; i < 10; i++) {
			input[i] = sc.nextInt();
		}
		HashSet<Integer> cnt = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			cnt.add(input[i]%42);
		}
		
		System.out.println(cnt.size());
	}

}
