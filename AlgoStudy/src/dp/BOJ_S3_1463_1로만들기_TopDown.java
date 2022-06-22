package dp;

import java.util.Scanner;

public class BOJ_S3_1463_1로만들기_TopDown {
	static int d[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		d = new int[N+1];
		System.out.println(dp(N));
		
	}

	private static int dp(int n) {
		if(n==1) {
			return 0;
		}
		if (d[n]>0) {
			return d[n];
		}
		d[n] = dp(n-1)+1;
		if (n%3==0) {
			d[n] = Math.min(d[n],  dp(n/3)+1);
		}
		if (n%2==0) {
			d[n] = Math.min(d[n],  dp(n/2)+1);
		}
		
		return d[n];
	}

}
