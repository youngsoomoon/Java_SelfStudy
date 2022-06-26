package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BOJ_S2_1260_DFS와BFS_2 {
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
		
		for (int i = 1; i < N+1; i++) {
			if(!visited[i]&&matrix[current][i]>0) {
				dfs(i);
			}
		}
	}
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(start);
		visited[start] = true;
		System.out.print(start+" ");
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			for (int i = 1; i <N+1 ; i++) {
				if(!visited[i]&&matrix[cur][i]>0) {
					q.offer(i);
					visited[i] = true;
					System.out.print(i+" ");
				}
			}
			
		}
		
	}

}
