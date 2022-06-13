package basic;

import java.util.Scanner;

public class BOJ_B1_1110_더하기사이클 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int N2 = -1;
		int cnt = 0;
		if(N<10) N*=10;
		int N0 = N;
		
		while(N!=N2) {
			N2=0;
			cnt++;
			if(N==0) {
				break;
			}
			int N1 = N0/10 + N0%10;
			N2 = (N0%10)*10 + N1%10;
			N0=N2;
		}
		System.out.println(cnt);
		
		
	}

}
