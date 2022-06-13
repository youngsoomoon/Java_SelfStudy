package basic;

import java.util.Scanner;

public class BOJ_B2_2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt = 1;
		int range = 2;
		
		if(N==1) {
			cnt = 1;
		}
		else {
			while(range <= N) {
				range += 6*cnt;
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
