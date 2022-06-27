package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S2_11724_연결요소의개수_BFS {
	static int N,M;
	static int[][] map;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			map[from][to] = map[to][from] = 1;
		}
		
		int cnt = 0;
		for (int i = 1; i < N+1; i++) {
			if(!visited[i]) {
				bfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	private static void bfs(int current) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(current);
		visited[current] = true;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			for (int i = 1; i < N+1; i++) {
				if(!visited[i]&&map[now][i]>0) {
					q.offer(i);
					visited[i]=true;
				}
			}
		}
		
		
	}

}
