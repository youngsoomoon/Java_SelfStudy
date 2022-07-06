package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S3_3085_사탕게임 {
	static char[][] map,copy;
	static int N,answer;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new char[N][N];
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		copy = map;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-1; j++) {
				char now = map[i][j];
				char next = map[i][j+1];
				
				if(now==next) continue;
				
				//행 기준 칸 교환 
				copy[i][j] = next;
				copy[i][j+1] = now;
				
				check();
				
				copy[i][j] = now;
				copy[i][j+1] = next;
				
				now = map[j][i];
				next = map[j+1][i];
				
				if(now==next) continue;
				
				copy[j][j] = next;
				copy[j+1][i] = now;
				check();
				copy[j][i] = now;
				copy[j+1][i] = next;
				
			}
		}
		
		if(answer>N) answer = N;
		System.out.println(answer);
		
		
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(copy[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

	private static void check() {
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			for (int j = 0; j < N-1; j++) {
				char now = copy[i][j];
				char next = copy[i][j+1];
				if(now==next) cnt++;
				else break;
			}
			answer = Math.max(answer, cnt);
		}
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			for (int j = 0; j < N-1; j++) {
				char now = map[j][i];
				char next = map[j+1][i];
				if(now==next) cnt++;
				else break;
			}
			answer = Math.max(answer, cnt);
		}
		
		
	}

}
