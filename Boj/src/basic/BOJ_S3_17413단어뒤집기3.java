package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ_S3_17413단어뒤집기3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			String str = br.readLine();
			char[] input = new char[str.length()];
			System.out.println(str.length());
			
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '<') {
					System.out.print(str.charAt(i));
					i++;
					while(str.charAt(i)!='>') {
						System.out.print(str.charAt(i));
						i++;
						continue;
					}
					if(str.charAt(i)=='>') {
						System.out.print(str.charAt(i));
						continue;
					}
				} // 태그 그대로 출력
				//태그 아닌 문자
				String[] arr = new String[100000];
				String noTag="";
				while(i<str.length()-1&&str.charAt(i+1)!='<') {
//					System.out.print(i+" ");
					noTag += str.charAt(i);
					i++;
				}
				if(i<str.length()-1&&str.charAt(i+1)=='<') {
					noTag += str.charAt(i);
				}
				
				arr = noTag.split(" ");
				for (int j = 0; j < arr.length; j++) {
					StringBuffer sb = new StringBuffer(arr[j]);
					String s = sb.reverse().toString();
					System.out.print(s);
				}
			}
		}
			
		
}


