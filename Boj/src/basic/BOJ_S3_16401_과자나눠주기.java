package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class BOJ_S3_16401_과자나눠주기 {
	static int M,N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken()); // 조카수
		N = Integer.parseInt(st.nextToken()); // 과자수
		int ans = -1; //결과값
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		bs(1,arr[N-1]);
		
			
		System.out.println(ans);
		}

	private static void bs(int s, int e) {
		int mid = (s+e)/2;
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			
		}
		
		
	}
					
}
