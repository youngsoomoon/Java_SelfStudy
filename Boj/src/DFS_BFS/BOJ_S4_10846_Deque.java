package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S4_10846_Deque {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new LinkedList<Integer>();
		int front = 0;
		int back = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push_front":
				front = Integer.parseInt(st.nextToken());
				dq.addFirst(front);
				break;
			case "push_back":
				back = Integer.parseInt(st.nextToken());
				dq.addLast(back);
				break;
			case "pop_front":
				if(!dq.isEmpty()) System.out.println(dq.pollFirst());
				else System.out.println("-1");
				break;
			case "pop_back":
				if(!dq.isEmpty()) System.out.println(dq.pollLast());
				else System.out.println("-1");
				break;
			case "size":
				System.out.println(dq.size());
				break;
			case "empty":
				if(dq.isEmpty()) System.out.println("1");
				else System.out.println("0");
				break;
			case "front":
				if(!dq.isEmpty()) System.out.println(dq.peekFirst());
				else System.out.println("-1");
				break;
			case "back":
				if(!dq.isEmpty()) System.out.println(dq.peekLast());
				else System.out.println("-1");
				break;
			}
			
		}
	}

}
