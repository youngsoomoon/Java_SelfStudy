package basic;

import java.util.Scanner;

public class BOJ_S4_12927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int size=input.length();
		char[] flash = new char[size+1];
		int cnt = 0;
		flash[0] = '0';
		for(int i=1; i<size+1;i++) {
			flash[i] = input.charAt(i-1);
		}
		
		
		for (int i = 1; i < size; i++) {
			if(flash[i] == 'N') continue;
			for (int j = i; j < size; j+=i) {
				flash[j] = flash[j]=='Y' ? 'N':'Y';
			}
			cnt++;
		}
		String str = new String(flash);
		if(str.contains("Y")) cnt=-1;
		
		System.out.println(cnt);
	}

}
