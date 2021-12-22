package basic100;

import java.util.Scanner;

public class exam018 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time[] = scanner.next().split(":");
		
		System.out.println(time[0]+":"+time[1]);
	}

}
