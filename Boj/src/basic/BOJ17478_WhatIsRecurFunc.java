import java.util.Scanner;

public class BOJ17478_WhatIsRecurFunc {

	static String str = "";
	static void recursive(int n) {
		
		String first = str;
		
		if(n==0) {
			System.out.println(first+"\"����Լ��� ������?\"");
			System.out.println(first+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(first+"��� �亯�Ͽ���.");
			return;
		}
		
		System.out.println(first+"\"����Լ��� ������?\"");
		System.out.println(first+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(first+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(first+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
		
		str += "____";
		recursive(n-1);
		
		System.out.println(first + "��� �亯�Ͽ���.");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recursive(n);
	}
}
