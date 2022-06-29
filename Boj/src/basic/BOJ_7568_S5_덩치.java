package basic;

import java.util.Scanner;

public class BOJ_7568_S5_덩치 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] input = new int[N][2];
		for (int i = 0; i < N; i++) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			
			int rank = 1;
			for (int j = 0; j < N; j++) {
				if (i==j) continue;
				
				if(input[i][0]<input[j][0]&&input[i][1]<input[j][1]) {
					rank++;
				}
				
				
			}
			System.out.println(rank+" ");
		}
		
	}

}
