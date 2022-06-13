public class l1_없는숫자더하기 {
	public int solution(int[] numbers) {
		
		boolean[] num = new boolean[10];
		int sum=0;
		
		for (int i = 0; i < numbers.length; i++) {
			num[numbers[i]] = true;
		}
		
		for (int i = 0; i < num.length; i++) {
			if(!num[i]) sum += i;
		}
		
        int answer = sum;
        return answer;
    }
}
