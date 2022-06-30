package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S3_17413_단어뒤집기2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		//입력된 문자열을 각 문자마다 접근해서 처리
		for (int i = 0; i < str.length(); i++) {
			//현재 문자가 '<'일때
			if(str.charAt(i) =='<') {
				//'>'문자가 올때 까지 반복
				while (str.charAt(i)!='>') {
					sb.append(str.charAt(i));
					i++;
				}
				//현재 문자가'>'일때 추가
				sb.append('>');
			}
			//태그 이외에 문자가 올 때
			else {
				//문자를 담아 줄 StringBuilder 생성
				StringBuilder word = new StringBuilder();
				//현재 문자가 공백, '<'아닐 때 반복, 공백제외 단어만 추가됨.
				//문자열의 맨 끝부분이 문자로 올 경우가 있기 때문에 i의 최대 인덱스를 체크.
				while (i<str.length()&&str.charAt(i)!=' '&&str.charAt(i)!='<') {
					word.append(str.charAt(i));
					i++;
				}
				//단어를 거꾸로 sb에 저장
				for (int j = word.length()-1; j >= 0; j--) {
					sb.append(word.charAt(j));
				}
				//단어 사이에 공백이 왔을 경우 sb에 넣어줌.
				if(i<str.length()&&str.charAt(i)==' ') sb.append(' ');
				//단어가 끝나고 태그가 시작될 경우
				//for문에서 i++을 해주면 '<'을 넘기기 때문에 i--을 해줌
				if(i<str.length()&&str.charAt(i)=='<') i--;
			}
			
		}
		System.out.println(sb);
		
	}

}
