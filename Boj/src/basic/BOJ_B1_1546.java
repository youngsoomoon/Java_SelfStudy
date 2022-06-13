package basic;

import java.util.Scanner;

public class BOJ_B1_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] score = new double[N];
		double MAX = Double.MIN_VALUE;
		for(int i=0;i<N;i++) {
			score[i]=sc.nextInt();
			if(score[i] >= MAX) {
				MAX = score[i] ;
			}
		}
		double sum = 0;
		double[] result = new double[N];
		for (int j = 0; j < N; j++) {
			result[j] = (double)score[j]/MAX*100;
			sum += result[j];
		}
		
		System.out.println(sum/N);
		
		
		
	}

}
