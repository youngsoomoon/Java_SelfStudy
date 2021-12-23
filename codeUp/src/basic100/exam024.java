package basic100;

import java.util.Scanner;

public class exam024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char list[] = new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			list[i] = s.charAt(i);
			System.out.printf("\'%c\'\n",list[i]);
		}
		
	}

}
