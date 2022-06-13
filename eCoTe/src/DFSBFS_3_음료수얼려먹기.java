

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_3_음료수얼려먹기 {
	static int[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int N,M,cnt,ans;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		
		cnt =1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] == 1) continue;
				ans++;
				bfs(i,j);
			}
		}
		System.out.println(ans);
		
	}

	private static void bfs(int r, int c) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(r);
		q.offer(c);
		map[r][c] = cnt;
		
		while(!q.isEmpty()) {
			int curR = q.poll();
			int curC = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = curR + dx[i];
				int ny = curC + dy[i];
				
				if(nx>=0 && ny>=0 && nx<N && ny<M && map[nx][ny] != 1) {
					q.offer(nx);
					q.offer(ny);
					map[nx][ny] = cnt;
				}
				
			}
		
		
		}
	}
	
}

