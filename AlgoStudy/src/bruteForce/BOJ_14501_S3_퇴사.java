package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14501_S3_퇴사 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		
		int N = Integer.parseInt(br.readLine());
		int[][] meeting = new int[N][2];
		int[] result = new int[N+1];
		for (int i = 0; i < meeting.length; i++) {
			st = new StringTokenizer(br.readLine());
			meeting[i][0] = Integer.parseInt(st.nextToken());
			meeting[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < N; i++) {
			int T = meeting[i][0];
			int P = meeting[i][1];
			if(i+T<=N) {
				result[i+T] = Math.max(result[i+T], result[i]+P);
			}
			result[i+1]=Math.max(result[i+1], result[i]);
		}
		System.out.println(result[N]);
	}

}
