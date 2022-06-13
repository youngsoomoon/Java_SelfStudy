package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_1316_groupWordChecker {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			boolean[] alpha = new boolean[26];
			String word = br.readLine();
			boolean gwc = true;
			
			for (int j = 0; j < word.length(); j++) {
				int index = word.charAt(j)-'a';
				//이미 사용한 문자일때
				if(alpha[index]) {
					//이 전의 문자와 다른 문자일때(그룹단어가 아닐때)
					if(word.charAt(j)!=word.charAt(j-1)) {
						gwc = false;
						break;
					}
				}
				
				//사용 하지 않은 문자일때
				else {
					alpha[index] = true;
				}
			}
			if(gwc) cnt++;
			}
		System.out.println(cnt);
		}
		
	}
