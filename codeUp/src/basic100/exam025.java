package basic100;

import java.util.Scanner;

public class exam025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = s.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("[" + arr[i]);
			for(int j = arr.length-1; j> i; j--) {
				System.out.print("0");
			}
		System.out.print("]\n");
		}
	}
}
