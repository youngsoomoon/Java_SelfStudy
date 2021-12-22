package basic100;

import java.util.Scanner;

public class exam019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] date = scanner.nextLine().split("\\.");
		
		int y = Integer.parseInt(date[0]);
		int m = Integer.parseInt(date[1]);
		int d = Integer.parseInt(date[2]);
		System.out.printf(String.format("%04d.%02d.%02d",y,m,d));
	}

}
