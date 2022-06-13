package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ10828_S4_Stack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i <N; i++) {
			String input = br.readLine();
			String[] data = input.split(" ");
			
			switch (data[0]) {
			case "push":
				stack.push(Integer.parseInt(data[1]));
				break;
			case "pop":
				if(stack.empty()) bw.write(-1+"\n");
				else bw.write(stack.pop()+"\n");
				break;
			case "size":
				bw.write(stack.size()+"\n");
				break;
			case "empty":
				if(stack.empty()) bw.write(1+"\n");
				else bw.write(0+"\n");
				break;
			case "top":
				if(stack.empty()) bw.write(-1+"\n");
				else bw.write(stack.peek()+"\n");
				break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
