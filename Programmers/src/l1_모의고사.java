import java.util.ArrayList;

public class l1_모의고사 {
	class Solution {
	    public int[] solution(int[] answers) {
	    	int[] first = {1,2,3,4,5};
	    	int[] second = {2,1,2,3,2,4,2,5};
	    	int[] third = {3,3,1,1,2,2,4,4,5,5};
	    	
	    	int f = 0;
	    	int s = 0;
	    	int t = 0;
	    	int f_idx = 0;
	    	int s_idx = 0;
	    	int t_idx = 0;
	    	
	    	for (int i = 0; i < answers.length; i++) {
	    		
				if(first[f_idx]==answers[i]) {
					f++;
				}
				if(second[s_idx]==answers[i]) {
					s++;
				}
				if(third[t_idx]==answers[i]) {
					t++;
				}
				
				if((f_idx+1)>4) {
					f_idx = 0;
				}else f_idx++;
				if((s_idx+1)>7) {
					s_idx = 0;
				}else s_idx++;
				if((t_idx+1)>9) {
					t_idx = 0;
				}else t_idx++;
				
			}
	    	
	    	int[] result = new int[3];
	    	result[0] = f;
	    	result[1] = s;
	    	result[2] = t;
	    	
	    	int high = 0;
	    	for (int i = 0; i < result.length; i++) {
				if(result[i]>=high) high = result[i];
			}
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for (int i = 0; i < result.length; i++) {
	        	if(result[i]>=high) {
	        		list.add(i+1);
	        	}
			}
	        int[] answer = new int[list.size()];
	        for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
	        
	        return answer;
	    }
	}
}
