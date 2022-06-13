package basic;

import java.util.Scanner;

public class BOJ_B3_10872 {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();

		System.out.println(factorial(N));
		
	}
	private static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
		return n*factorial(n-1);
		}
	}

}
