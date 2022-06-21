package realization;

import java.util.Scanner;

public class BOJ_S5_1475_방번호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int[] num = new int[N.length()];
		
		for (int i = 0; i < N.length(); i++) {
			num[i] = N.charAt(i)-'0';
		}
		int[] check = new int[10];
		
		
		for (int i = 0; i < num.length; i++) {
			check[num[i]]++;
		}
		int k = check[6]+check[9];
		if(k%2==0) {
			check[6] = k/2;
			check[9] = k/2;
		}else {
			check[6] = k/2+1;
			check[9] = k/2+1;
		}
		int ans = -1;
		for (int i : check) {
			ans = Math.max(ans, i);
		}
		System.out.println(ans);
		
	}

}
