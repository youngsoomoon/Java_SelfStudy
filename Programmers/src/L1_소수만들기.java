import java.util.Arrays;

public class L1_소수만들기 {

   public int solution(int[] nums) {
		boolean[] num = new boolean[3000];
		num[1] = true;
		int answer = 0;
		//num에 false로 되어있는 것들은 소수 : 에라토스테네스의 체?사용
		for (int i = 1; i< Math.sqrt(3000)+1; i++) {
			if(num[i]) continue;
			for (int j = i+i; j < 3000; j+=i) {
				num[j] = true;
			}
		}
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					int a = nums[i];
					int b = nums[j];
					int c = nums[k];
					int sum = a+b+c;
					
					if(!num[sum]){
                        answer++;
                    }
				}
			}
		}

        return answer;
    }
}

