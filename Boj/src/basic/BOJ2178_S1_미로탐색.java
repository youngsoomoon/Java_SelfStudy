package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BOJ2178_S1_미로탐색 {
	static int N,M,cnt;
	static int[][] map;
	static boolean[][] visited;
	static int[] nx = {-1,1,0,0};
	static int[] ny = {0,0,-1,1};
	
	
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
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		bfs(0,0);
		
		System.out.println(map[N-1][M-1]);
	}



	private static void bfs(int x,int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		visited[x][y] = true;
		q.offer(new int[] {x,y});
		while(!q.isEmpty()) {
			int[] now = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for (int i = 0; i < 4; i++) {
				int nextX = nowX + nx[i];
				int nextY = nowY + ny[i];
				
				if(nextX < 0 || nextY<0 || nextX>=N || nextY>=M) continue;
				
				if(!visited[nextX][nextY] && map[nextX][nextY]>0) {
					q.offer(new int[] {nextX,nextY});
					map[nextX][nextY] = map[nowX][nowY] + 1;
					visited[nextX][nextY]=true;
				}
			}
			
		}
		
	}


}
