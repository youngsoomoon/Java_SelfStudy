package Comb_Permu;

import java.util.Scanner;

public class BOJ1010_S5_다리놓기 {
	static int N,R,ans;
	static int[] input, numbers;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
		
		R = sc.nextInt();
		N = sc.nextInt();
		
		input = new int[N];
		numbers = new int[R];
		
		for (int j = 0; j < N; j++) {
			input[j] = j+1;
		}
		ans = 0;
		combination(0,0);
		System.out.println(ans);
		}
	}

	private static void combination(int cnt, int start) {
		if (cnt==R){
			ans++;
			return;
		}
		
		for (int i = start; i < N; i++) {
			numbers[cnt] = input[i];
			combination(cnt+1, i+1);
		}
	}

}
