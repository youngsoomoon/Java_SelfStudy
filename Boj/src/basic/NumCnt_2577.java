package basic;

import java.util.Scanner;

public class NumCnt_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = a*b*c;
		String str = Integer.toString(num);
		char[] ch = str.toCharArray();
		int[] cnt = new int[10];
		
		for (int i = 0; i < ch.length; i++) {
			cnt[ch[i]-'0']++;
		}
		for (int i : cnt) {
			System.out.println(i);
		}
		
	}

}
