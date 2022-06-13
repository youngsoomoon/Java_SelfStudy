package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1032_B1_명령프롬프트 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[50];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		String ans ="";
		
		int cnt = 0;
		char[] c1 = arr[0].toCharArray();
		while(true) {
			cnt++;
			if(cnt == N) break;
			ans = "";
			char[] c2 = arr[cnt].toCharArray();
			
			for (int j = 0; j < c1.length; j++) {
				if(c1[j]==c2[j]) {
					ans = ans+c1[j];
				} else {
					ans = ans+'?';
				}
			}
			c1 = ans.toCharArray();
		}
		if(N==1) ans += arr[0];
		System.out.println(ans);
		
	}

}
