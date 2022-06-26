package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_G5_13023 {
	static int N;
	static ArrayList<Integer>[] map;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		map = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			map[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			map[from].add(to);
			map[to].add(from);
		}
		
		for (int i = 0; i < N; i++) {
			visited = new boolean[N];
			dfs(i,0);
		}
		System.out.println(0);
	}

	private static void dfs(int r,int cnt) {
		if(cnt==4) {
			System.out.println(1);
			System.exit(0);
		}
		visited[r] = true;
		
		for (int i = 0; i < map[r].size(); i++) {
			int c = map[r].get(i);
			if(visited[c]==false) {
				visited[c] = true;
				dfs(c,cnt+1);
				visited[c] = false;
			}
			
		}
	}

}
