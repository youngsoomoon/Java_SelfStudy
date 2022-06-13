package basic;

import java.util.Scanner;

public class BOJ_S4_2477_KoreanMelon {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] dir = new int[6];
		int[] length = new int[6];
		int now = -1;
		
		int maxR = 0;
		int maxC = 0;
		int maxR_idx = -1;
		int maxC_idx = -1;
		for (int i = 0; i < 6; i++) {
			int dir_now = sc.nextInt();
			int length_now = sc.nextInt();
			dir[i] = dir_now;
			length[i] = length_now;
			
			
			if (dir_now == 1||dir_now == 2) { //가로 최대값과 인덱스 구하기
				if(maxR<length_now) {
					maxR = length_now;
					maxR_idx = i;
				}
			}else if (dir_now == 3||dir_now == 4) { //가로 최대값과 인덱스 구하기
				if(maxC<length_now) {
					maxC = length_now;
					maxC_idx = i;
				}
			}
		}
		
		int miniR = 0;
		int miniC = 0;
		if(maxR_idx == 0) miniC = Math.abs(length[1]-length[5]);
		else if(maxR_idx == 5) miniC = Math.abs(length[0]-length[4]);
		else miniC = Math.abs(length[maxR_idx+1]-length[maxR_idx-1]);
		
		if(maxC_idx == 0) miniR = Math.abs(length[1]-length[5]);
		else if(maxC_idx == 5) miniR = Math.abs(length[0]-length[4]);
		else miniR = Math.abs(length[maxC_idx+1]-length[maxC_idx-1]);
		
		int answer = maxR*maxC-miniR*miniC;
		answer *= N;
		System.out.println(answer);
	}

}
