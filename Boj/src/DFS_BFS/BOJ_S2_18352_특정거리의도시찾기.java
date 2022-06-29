package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S2_18352_특정거리의도시찾기 {
	static int N,M,K,X,cnt;
	static ArrayList<ArrayList<Integer>> map;
	static boolean[] visited;
	static int[] answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		
		map = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < N+1; i++) {
			map.add(new ArrayList<Integer>());
		}
		answer = new int[N+1];
		Arrays.fill(answer, 300001);
		answer[X] = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			map.get(from).add(to);
		}
		
		bfs(X);
		for (int i = 1; i < N+1; i++) {
			if( answer[i]==K ) result.add(i);
		}
		if(!result.isEmpty()) {
			Collections.sort(result);
			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}
		}
		else System.out.println(-1);
	}
	private static void bfs(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x);
		
		while(!q.isEmpty()) {
			int now = q.poll();
			for (int i = 0; i < map.get(now).size(); i++) {
				int next = map.get(now).get(i);
				
				if(answer[next] == 300001) {
					answer[next] = answer[now] + 1;
					q.add(next);
				}
			}
		}
	}
	

}
