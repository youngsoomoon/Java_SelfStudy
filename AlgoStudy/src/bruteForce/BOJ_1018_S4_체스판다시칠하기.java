package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018_S4_체스판다시칠하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		boolean[][] map = new boolean[N][M];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				if(str.charAt(j)=='W') map[i][j] = true;
			}
		}
		
		for (int a = 0; a < N-7; a++) {
			for (int b = 0; b < M-7; b++) {
				
				int cnt=0;
				boolean color = map[a][b];
				
				for (int x = a; x < a+8; x++) {
					for (int y = b; y < b+8; y++) {
						if(map[x][y] != color) cnt++;
						color = !color;
					}
					color = !color; 
				}
				
				cnt = Math.min(cnt, 64-cnt);
				min = Math.min(cnt,min);
			}
		}
		System.out.println(min);
	}

}
