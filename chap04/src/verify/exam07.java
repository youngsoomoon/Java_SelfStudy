package verify;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
			int inputData = Integer.parseInt(scanner.nextLine());
			
			switch(inputData) {
			case 1: 
				System.out.print("���ݾ�>");
				balance += Integer.parseInt(scanner.nextLine());
				break;
				
			case 2: 
				System.out.print("��ݾ�>");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
				
			case 3:
				System.out.println("�ܰ�>" + balance);
				break;
				
			case 4: 
				run = false;
				System.out.println("���α׷� ����");
				break;
			}
			

		}
	}
}
