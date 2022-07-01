package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_G5_연구소 {
	static int[][] map,copy_map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int N,M,result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		copy_map = new int[N][M];
		result = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		copy_map = map;
		dfs(0);
		System.out.println(result);
	}
	private static void dfs(int wall) {
		
		if(wall==3) {
			bfs();
			return;
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j]==0) {
					map[i][j] = 1;
					dfs(wall+1);
					map[i][j] = 0;
				}
			}
		}
		
	}
	private static void bfs() {
		
		int[][] virus_map = new int[N][M];
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 0; i < N; i++) 
			for (int j = 0; j < M; j++) 
				virus_map[i][j] = map[i][j];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(virus_map[i][j]==2) {
					q.offer(i);
					q.offer(j);
				}
			}
		}
		
		while(!q.isEmpty()) {
			int r = q.poll();
			int c = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = r + dx[i];
				int ny = c + dy[i];
				
				if(nx>=0&&nx<N&&ny>=0&&ny<M) {
					if(virus_map[nx][ny]==0) {
						virus_map[nx][ny] = 2;
						q.offer(nx);
						q.offer(ny);
					}
				}
			}
			
		}
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(virus_map[i][j]==0) cnt++;
			}
		}
		
		result = Math.max(cnt, result);
	}

}
