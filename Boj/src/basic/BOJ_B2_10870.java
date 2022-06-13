package basic;

import java.util.Scanner;

public class BOJ_B2_10870 {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		System.out.println(fibo(N));
	}

	static int fibo(int n) {
		if (n == 0|| n==1) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);
	}

}
