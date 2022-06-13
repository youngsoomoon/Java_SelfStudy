package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1012_S2_유기농배추 {
	
	static int[][] map;
	static int N,M,cnt;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static Queue<Integer> q = new LinkedList<Integer>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			map = new int[N][M];
			
			for (int i = 0; i < K; i++) {
				String[] str = br.readLine().split(" ");
				int x = Integer.parseInt(str[0]);
				int y = Integer.parseInt(str[1]);
				map[y][x] = 1;
			}
			cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if(map[i][j]==0) continue;
					if(map[i][j] > 0) {
						System.out.println(i+" "+j);
						bfs(i,j);
					}
				}
			}
			
			System.out.println(cnt);
			
			
		}
	}
	private static void bfs(int x, int y) {
		if(map[x][y]>0) {
		q.offer(x);
		q.offer(y);
		cnt++;
		}
		
		while(!q.isEmpty()) {
			int r = q.poll();
			int c = q.poll();
			
			if(map[r][c]>0) map[r][c]=0;
			
			for (int i = 0; i < 4; i++) {
				int nr = r + dx[i];
				int nc = c + dy[i];
				
				if(nr<0 || nc <0 || nr>=N || nc>= M) continue;
				
				if(map[nr][nc]>0) {
					map[nr][nc]=0;
					q.offer(nr);
					q.offer(nc);
				}
				
			}
			
		}
		
	}

}
