package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class BOJ_G5_1759 {
	static int L;
	static int C;
	static char[] alpha,selected;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		alpha = new char[C];
		selected = new char[L];
		for (int i = 0; i < C; i++) {
			alpha[i] = st.nextToken().charAt(0);
		}
		
		Arrays.sort(alpha);
		
		combination(0,0);// C Comb L 구하기
		System.out.println(sb);
	}

	private static void combination(int cnt, int start) {
		if (cnt == L) {
			boolean flag = check(selected);//조건 체크
			if(flag) {
				for (char c : selected) {
					sb.append(c);
				}
				sb.append("\n");
			}
			return;
			
		}
		
		for (int i = start; i < C; i++) {
			selected[cnt] = alpha[i];
			combination(cnt+1, i+1);
		}
		
	}

	private static boolean check(char[] selected) {
		//모음 1개이상, 자음 2개이상
		int vo = 0, co =0;
		for (int i = 0; i < selected.length; i++) {
			if(selected[i]=='a'||selected[i]=='e'||selected[i]=='i'||selected[i]=='o'||selected[i]=='u') {
				vo++;
			}else {
				co++;
			}
		}
		if(vo>0 && co>1) {
			return true;
		} else {
			return false;
		}
	}

}
