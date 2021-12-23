package basic100;

import java.util.Scanner;

public class exam025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = s.split("");
		
		//int num = Integer.parseInt(s);
		
		for(int i=0;i<s.length();i++) {
			System.out.printf("[%d]\n",(Integer.parseInt(arr[i])*(10^(4-i))));
		}
	}

}
