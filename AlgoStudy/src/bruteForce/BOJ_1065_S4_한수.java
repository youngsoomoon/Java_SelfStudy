package bruteForce;

import java.util.Scanner;

public class BOJ_1065_S4_한수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		for (int i = 1; i < N+1; i++) {
			if(i<100) cnt++;
			else {
				int a = i/100;
				int b = i%100/10;
				int c = i%10;
				
				if((a-b)==(b-c)) cnt++;
			}
		}
		System.out.println(cnt);
		
				
	}

}
