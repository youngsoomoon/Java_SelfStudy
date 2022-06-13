package basic;

import java.util.Scanner;

public class BOJ_B2_2798_blackJack {
	static int[] card, numbers;
	static int N,M,cnt,ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		card = new int[N];
		numbers = new int[3];
		
		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		
		combination(0,0);
		System.out.println(ans);
		
	}

	private static void combination(int cnt, int start) {
		if(cnt == 3) {
			int sum = 0;
			for (int k = 0; k < 3; k++) {
				sum += numbers[k];
			}
			if (ans<sum && sum <= M) {
				ans = sum;
			}
			return;
		}
		
		for (int j = start; j < card.length; j++) {
			numbers[cnt] = card[j];
			combination(cnt+1, j+1);
		}
	}

}
