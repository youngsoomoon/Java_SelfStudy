package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ1388_S4_바닥장식 {
	static int R,C,cnt;
	static char[][] map;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		
		map = new char[R][C];
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			map[i] = str.toCharArray();
		}
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if(map[i][j]=='-') {
					cnt++;
					while(j<C && map[i][j]=='-') {
						j++;
					}
				}
			}
		}
		
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < R; j++) {
				if(map[j][i]=='|') {
					cnt++;
					while(j<R&&map[j][i]=='|') {
						j++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
	}


}
