package basic;

import java.util.Scanner;

public class BOJ_B1_2810_cupHolder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String seats = sc.next();
		
		int result = 1;
		
		for (int i = 0; i < seats.length(); i++) {
			char c = seats.charAt(i);
			if(c == 'S') {
				result++;
			}else {
				result++;
				i++;
			}
		}
		
		if(result>N) {
			result = N;
		} 
		System.out.println(result);
		
	}

}
