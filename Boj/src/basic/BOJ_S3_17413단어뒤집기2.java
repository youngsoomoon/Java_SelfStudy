package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ_S3_17413단어뒤집기2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			String str = br.readLine();
			char[] input = new char[str.length()];
			String noTag = "";
			boolean flag = false;
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '<') {
					i++;
					while(str.charAt(i)!='>') {
						i++;
						continue;
					}
					if(str.charAt(i)=='>') {
						continue;
					}
				}
				noTag += str.charAt(i);
			}
			
			String[] arr = new String[100000];
			arr = noTag.split(" ");
			for (int i = 0; i < arr.length; i++) {
				StringBuffer sb = new StringBuffer(arr[i]);
				String s = sb.reverse().toString();
				System.out.print(s+" ");
			}
		
	}

}
