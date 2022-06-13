package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ_B1_9093단어뒤집기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			
			String[] str = new String[1000];
			str = br.readLine().split(" ");
			
			for (int i = 0; i < str.length; i++) {
				StringBuffer sb = new StringBuffer(str[i]);
				String s = sb.reverse().toString();
				System.out.print(s+" ");
			}
			System.out.println();
		}
		
	}

}
