package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_1978_소수찾기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		st = new StringTokenizer(br.readLine());
		//내 기본 풀이
//		for (int i = 0; i < N; i++) {
//			int num = Integer.parseInt(st.nextToken());
//			int a = 2;
//			if( num == 2 ) {
//				cnt++;
//				continue;
//			}
//			while(a<num) {
//				if( num % a == 0 ) {
//					break;
//				} else {
//					if(num-1 == a) cnt++;
//					a++;
//					continue;
//				}
//			}
//		}
		//에라토스테네스의 체 이용
		boolean[] map = new boolean[1001];
		map[0] = true;
		map[1] = true;
		
		for (int i = 2; i < Math.sqrt(1001); i++) {
			if(map[i] == true) continue;
			for(int j = i*i;j<1001;j = j+i) {
				map[j] = true;
//				System.out.println("j: "+j);
			}
		}
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(!map[num]) cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
