package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BOJ2644_촌수계산 {
	static int N,targetA,targetB,m,cnt;
	static int[][] family;
	static int[] chon;
	static int[] visited;
	static boolean flag;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		targetA = Integer.parseInt(st.nextToken());
		targetB = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(br.readLine());
		family = new int[N+1][N+1];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int to = Integer.parseInt(st.nextToken());
			int from = Integer.parseInt(st.nextToken());
			family[from][to] = family[to][from] = 1;
		}
		visited = new int[N+1];
		bfs(targetA);
		
		if(visited[targetB] ==0 ) System.out.println(-1);
		else System.out.println(visited[targetB]);
	}

	private static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(start);
//		visited[start] = true;
		while(!q.isEmpty()) {
			int current = q.poll();
			
			if (current == targetB) {
				return;
			}
			
//			for (int i = 1; i < N+1; i++) {
//				if(!visited[i] && family[current][i]>0) {
//					chon[i] = cnt;
//				}
//			}
			
			for (int i = 1; i < N+1; i++) {
				if(visited[i]==0 && family[current][i]>0) {
					q.offer(i);
					visited[i] = visited[current]+1;
				}
			}
			
		}
	}

}

