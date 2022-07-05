package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_G4_13913_숨바꼭질4 {
	static int N,K,ans;
	static int[] map,parent;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		N = sc.nextInt();
		K = sc.nextInt();
		
		map = new int[100001];
		parent = new int[100001];
		
    	bfs(N);
    	sb.append(map[K]-1+"\n");
    	
    	Stack<Integer> stack = new Stack<>();
    	stack.push(K); 
    	int index = K;
    	
    	while(index!=N) {
    		stack.push(parent[index]);
    		index = parent[index];
    	}
    	
    	while(!stack.isEmpty()) {
    		sb.append(stack.pop()+" ");
    	}
		System.out.println(sb.toString());
		
	}
	private static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
        q.add(start);
        map[start] = 1;

        while (!q.isEmpty()) {
            int temp = q.poll();
            
            if (temp == K) {
            	return ;
            }

            for (int i = 0; i < 3; i++) {
                int next;
                
                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }


                if (next >= 0 && next < map.length && map[next] == 0) {
                    q.add(next);
                    map[next] = map[temp] + 1;
                    parent[next] = temp;
                }
            }
			
			
		}
	}

}
