package basic;

import java.util.Scanner;
import java.util.Stack;

public class BOJ10773_S4_제로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if(num==0) {
				stack.pop();
			}
			else {
				stack.push(num);
			}
		}
		long ans=0;
		for (int i = 0; i < stack.size(); i++) {
			ans += stack.get(i);
		}
		System.out.println(ans);
		
	}

}
