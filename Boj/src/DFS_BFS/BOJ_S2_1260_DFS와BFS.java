package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BOJ_S2_1260_DFS와BFS {
	static int N,M,V;
	static int[][] matrix;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
	
		matrix = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			matrix[from][to] = matrix[to][from] = 1;
		}
		
		dfs(V);
		System.out.println();
		visited = new boolean[N+1];
		bfs(V);
	}


	public static void dfs(int current) {
		visited[current] = true;
		System.out.print(current+" ");
		
		for (int i = 1; i <=N; i++) {
			if(!visited[i] && matrix[current][i]>0) {
				dfs(i);
			}
		}
		
	}
	public static void bfs(int start) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(start);
		visited[start] = true;
		while(!q.isEmpty()) {
			int current = q.poll();
			System.out.print(current+" ");
			
			for (int i = 1; i <= N; i++) {
				if(!visited[i] && matrix[current][i]>0) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
		
		
	}

}
