package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_S1_1697_숨바꼭질 {
	static int N,K,sec;
	static int[] map;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		sec = 0;
		
		map = new int[100001];
		if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
		
	}
	private static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
        q.add(start);
        map[start] = 1;

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }

                if (next == K) {
                    System.out.println(map[temp]);
                    return;
                }

                if (next >= 0 && next < map.length && map[next] == 0) {
                    q.add(next);
                    map[next] = map[temp] + 1;
                }
            }
			
			
		}
	}

}
