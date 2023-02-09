package verify;

public class exam03 {

	public static void main(String[] args) {
		int sum = 0;
		while(sum != 5) {
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			sum = num1 + num2;
			System.out.printf("(%d,%d)\n",num1,num2);
		}
	}

}
