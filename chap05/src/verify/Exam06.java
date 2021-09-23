package verify;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;

		int studentNum = 0;
		int[] scores = null;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------------------------");
			System.out.print("����> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				System.out.println();
				
			} else if (selectNo == 2) {
				System.out.print("�����Է�> ");
				for(int i = 0; i < scores.length;i++) {
					System.out.printf("scores[%d]: ",i);
					scores[i] = Integer.parseInt(scanner.nextLine());
					System.out.println();
				}

				
			} else if (selectNo == 3) {
				for(int i = 0; i < scores.length;i++) {
					System.out.printf("scores[%d]: %d",i,scores[i]);
					System.out.println();
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				int count = 0;
				double avg = 0;
				
				for(int i = 0; i < scores.length;i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
					count++;
				}
				avg = (double) sum/count;
				System.out.println("�ְ����� : "+max);
				System.out.println("������� : "+avg);
				
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("���α׷� ����");
	}
}
