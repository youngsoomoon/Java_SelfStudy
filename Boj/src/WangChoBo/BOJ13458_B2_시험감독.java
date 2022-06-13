package WangChoBo;

import java.util.Scanner;

public class BOJ13458_B2_시험감독 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		int T1 = sc.nextInt();
		int T2 = sc.nextInt();
		long cnt = 0;
		
		for (int i = 0; i < A.length; i++) {
			if(A[i]<=T1) {
				cnt++;
				continue;
			} else {
				cnt++;
				A[i] -= T1;
				if(A[i]%T2==0) {
					cnt += A[i]/T2;
				} else if(A[i]%T2!=0){ 
					cnt += A[i]/T2 + 1;
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
