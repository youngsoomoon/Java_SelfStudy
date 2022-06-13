package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178_S1_미로탐색 {
	static int N,M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N =Integer.parseInt(st.nextToken());
		M =Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		
		bfs(0,0);
		
		System.out.println(map[N-1][M-1]);
	}
	private static void bfs(int x, int y) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(x);
		q.offer(y);
		visited[x][y] = true;
		
		
		while(!q.isEmpty()) {
			int r = q.poll();
			int c = q.poll();
				
			for (int i = 0; i < 4; i++) {
				int nr = r + dx[i];
				int nc = c + dy[i];
					
				if (nr>=0 && nc>=0 && nr<N && nc<M &&
						visited[nr][nc]==false && map[nr][nc]>0) {
					visited[nr][nc]=true;
					map[nr][nc] = map[r][c]+ 1;
					q.offer(nr);
					q.offer(nc);
				}
			}
		}
	}

}

