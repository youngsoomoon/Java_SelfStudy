import java.util.Arrays;

public class l1_K번째수 {
	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	    	int[] answer = new int[commands.length];
	    	int idx = 0;
	    	for (int c = 0; c < commands.length; c++) {
					int i = commands[c][0];
					int j = commands[c][1];
					int k = commands[c][2];
					
					int[] com = new int[j-i+1];
					for (int l = 0; l < com.length; l++) {
						com[l] = array[i-1];
						i++;
					}
					
					Arrays.sort(com);
					answer[idx] = com[k-1];
					idx++;
			}
	        return answer;
	    }
	}
}
