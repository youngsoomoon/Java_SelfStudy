
public class L1_완주하지못한선수 {
	public static String solution(String[] participant, String[] completion) {
		
		boolean[] part = new boolean[participant.length];
		boolean[] comp = new boolean[completion.length];
		String answer = "";
		
		
		for (int i = 0; i < participant.length; i++) {
			for (int j = 0; j < completion.length; j++) {
				if(comp[j]) continue;
				if(participant[i] == completion[j]) {
//					System.out.println(i);
					part[i] = true;
					comp[j] = true;
				}
			}
		}
		
		for (int k = 0; k < part.length; k++) {
			if(!part[k]) {
				answer = participant[k];
			}
		}
		
		for (int i = 0; i < part.length; i++) {
			System.out.print(part[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < comp.length; i++) {
			System.out.print(comp[i]+" ");
		}
		System.out.println();
        return answer;
    }

	public static void main(String[] args) {
		String[] a = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] b = {"josipa", "filipa", "marina", "nikola"};
		
		System.out.println(solution(a, b));
	}
}
