
public class l1_lotto {

	public int[] solution(int[] lottos, int[] win_nums) {
		int correct = 0;
		int noCorrect = 0;
		int zero = 0;
		int minRank = 0;
		int maxRank = 0;
		
		for (int i = 0; i < lottos.length; i++) {
			if(lottos[i] == 0) {
				zero++;
				continue;
			}
			for (int j = 0; j < win_nums.length; j++) {
				if(lottos[i]==win_nums[j]) correct++;
			}
		}
		
		int[] Rank = new int[] {6,6,5,4,3,2,1};
		
		minRank = Rank[correct];
		maxRank = Rank[correct+zero];
		
        int[] answer = {maxRank,minRank};
        return answer;
    }
		
		
		

}
