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
		
		int sex;//성별
		int num;//받은 자연수
		//학생 수 만큼 스위치 전원처리
		for (int i = 0; i < stuNo; i++) {
			st = new StringTokenizer(br.readLine());
			sex = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			
			//남학생일 경우
			if(sex == 1) {
				//자신이 가진 수의 배수번째 스위치 모두 바꿈
				int idx = num;
				while(idx<=N) {
					arr[idx] = (arr[idx]==0) ? 1 : 0;
					idx += num;
				}
				
			}
			
			//여학생일 경우
			if(sex == 2) {
				//자신이 가진 수번째 바꾸고, 이후 좌우가 대칭일때만 값 변경
				int idx = num;
				int L = num - 1;
				int R = num + 1;
				
				//자신이 가진 수 번째의 스위치 변경
				arr[idx] = (arr[idx]==0) ? 1 : 0;
				//이후 좌우 인덱스가 대칭일때만 변경
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
		
		//출력
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
