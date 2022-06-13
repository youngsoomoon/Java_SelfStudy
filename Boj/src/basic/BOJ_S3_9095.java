package basic;

import java.util.Scanner;

public class BOJ_S3_9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			
			int[] arr = new int[12];
			
			arr[0] = 0;
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 4;
			arr[4] = 7;
			for (int i = 4; i <=N ; i++) {
				arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
			}
			System.out.println(arr[N]);
		}
		
		
	}

}
