package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S4_10845_Queue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		int back = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				back = Integer.parseInt(st.nextToken());
				q.add(back);
				break;
			case "pop":
				if(!q.isEmpty()) System.out.println(q.poll());
				else System.out.println("-1");
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty()) System.out.println("1");
				else System.out.println("0");
				break;
			case "front":
				if(!q.isEmpty()) System.out.println(q.peek());
				else System.out.println("-1");
				break;
			case "back":
				if(!q.isEmpty()) System.out.println(back);
				else System.out.println("-1");
				break;
			}
			
		}
	}

}
