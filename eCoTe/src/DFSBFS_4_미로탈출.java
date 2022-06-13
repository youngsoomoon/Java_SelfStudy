
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_4_미로탈출 {
	static int N,M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		
		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			for (int j = 1; j <= M; j++) {
				map[i][j] = str.charAt(j-1) - '0';
			}
		}
		
		bfs(1,1);
		
		System.out.println(map[N][M]);
//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= M; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
				
		
	}

	private static void bfs(int r, int c) {
		Queue<Integer> q = new LinkedList<>();
		visited[r][c] = true;
		q.offer(r);
		q.offer(c);
		
		while(!q.isEmpty()) {
			int curR = q.poll();
			int curC = q.poll();
			
			if(map[curR][curC] == 0) continue;
			for (int i = 0; i < 4; i++) {
				int nx = curR + dx[i];
				int ny = curC + dy[i];
				
				if(nx>0&& ny>0 && nx<=N && ny<=M && visited[nx][ny]==false &&map[nx][ny]!=0) {
					q.offer(nx);
					q.offer(ny);
					
					visited[nx][ny] = true;
					map[nx][ny] = map[curR][curC]+1; 
				}
			}
		}
		
		
	}

	
}

