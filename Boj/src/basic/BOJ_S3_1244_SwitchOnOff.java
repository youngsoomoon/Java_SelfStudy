package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_S3_1244_SwitchOnOff {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int stuNo = Integer.parseInt(br.readLine());
		
		int sex;//����
		int num;//���� �ڿ���
		//�л� �� ��ŭ ����ġ ����ó��
		for (int i = 0; i < stuNo; i++) {
			st = new StringTokenizer(br.readLine());
			sex = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			
			//���л��� ���
			if(sex == 1) {
				//�ڽ��� ���� ���� �����° ����ġ ��� �ٲ�
				int idx = num;
				while(idx<=N) {
					arr[idx] = (arr[idx]==0) ? 1 : 0;
					idx += num;
				}
				
			}
			
			//���л��� ���
			if(sex == 2) {
				//�ڽ��� ���� ����° �ٲٰ�, ���� �¿찡 ��Ī�϶��� �� ����
				int idx = num;
				int L = num - 1;
				int R = num + 1;
				
				//�ڽ��� ���� �� ��°�� ����ġ ����
				arr[idx] = (arr[idx]==0) ? 1 : 0;
				//���� �¿� �ε����� ��Ī�϶��� ����
				while(L>0 && R<=N) {
					if(arr[L] == arr[R]) {
						arr[L] = (arr[L]==0) ? 1 : 0;
						arr[R] = (arr[R]==0) ? 1 : 0;
						L--;
						R++;
					} else {
						break;
					}
				}
				
			}
			
		}
		
		//���
		int cnt = 0;
		for (int i=1; i<arr.length;i++) {
			if(cnt == 20) {
				System.out.println();
				cnt = 0;
			}
			System.out.print(arr[i]+" ");
			cnt++;
		}
		
		
	}

}
