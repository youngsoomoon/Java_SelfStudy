package dp;

import java.util.Scanner;

public class BOJ_S3_1463_1로만들기2_BottomUp {
	static int start = 1;
	static int[] num = new int[1000001];
	static int cnt = 0;
	static int N = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int[] dp = new int[N+1];
		dp[0] = 0;
		dp[1] = 0;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1]+1;
			if(i%2==0) dp[i] = Math.min(dp[i],dp[i/2]+1);
			if(i%3==0) dp[i] = Math.min(dp[i],dp[i/3]+1);
		}
		System.out.println(dp[N]);
		
	}


}
