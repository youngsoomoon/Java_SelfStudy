import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
4 4 2 1
1 2
1 3
2 3
2 4
*/
public class DFSBFS_15_특정거리의도시찾기 {
	static int N,M,K,X,cnt;
	static int[][] map;
	static int[] min;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][N+1];
		min = new int[N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			map[from][to] = 1;
		}
		
		for (int i = 1; i <= N; i++) {
			min[i] = Integer.MAX_VALUE;
		}
		cnt = 1;
		bfs(X);
		
		boolean flag = false;
		for (int i = 1; i <= N; i++) {
			if(min[i]==K+1) {
				System.out.println(i);
				flag = true;
			}
		}
		if(!flag) System.out.println(-1);
		
	}
	private static void bfs(int start) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		min[start] = 0;
		
		while(!q.isEmpty()) {
			int current = q.poll();
			
			for (int c = current+1; c <= N; c++) {
				if(map[current][c]>0) {
					q.offer(c);
					if(min[current] >= map[current][c]) {
						min[current] = cnt;
					}
				}
			}
			cnt++;
			
		}
		
		
	}
}
