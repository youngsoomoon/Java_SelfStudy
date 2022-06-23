package realization;

import java.util.Scanner;

public class BOJ_S4_1748_수이어쓰기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int ans = 0;
		int a = 0;
		String str = Integer.toString(num);
		int size = str.length();
		if(num<10) ans=num;
		else {
			for (int i = 1; i < size; i++) {
				a += 9*Math.pow(10, i-1);
				ans += 9*Math.pow(10, i-1)*i;
			}
			ans = ans + (num-a)*size;
		}
		System.out.println(ans);
		
	}

}
