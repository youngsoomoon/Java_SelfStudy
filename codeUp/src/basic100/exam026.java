package basic100;

import java.util.Scanner;

public class exam026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split(":");
		
		int h = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int sec = Integer.parseInt(s[2]);
		
		System.out.println(m);
	}

}
