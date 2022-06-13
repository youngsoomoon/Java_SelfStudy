package basic;

import java.awt.Label;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_S3_1051 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		for (int r = 0; r < N; r++) {
			String str = br.readLine();
			for (int c = 0; c < M; c++) {
				map[r][c] = str.charAt(c)-'0';
			}
		}
		
		int[] dx = {0,1,1};//우,하,우하
		int[] dy = {1,0,1};
		
		int min = Math.min(N, M);
		int size = 1;
		
		for(int k = 2; k <= min; k++) {
			for (int i = 0; i < N-k+1; i++) {
				for (int j = 0; j < M-k+1; j++) {
					if(map[i][j] == map[i][j+k-1] && map[i][j] == map[i+k-1][j] && 
							map[i][j] == map[i+k-1][j+k-1]) {
						if(size<k) {
							size = k;
						}
					}
					
				}
			}
		}
		System.out.println(size*size);
		
		
		
	}

}
