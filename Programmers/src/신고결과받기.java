import java.util.ArrayList;
import java.util.StringTokenizer;

public class 신고결과받기 {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        return answer;
    }

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};//��ü ����id ����Ʈ
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};//�Ű� ��� ����Ʈ
		int k; //�����Ǵ� �Ű� Ƚ��
		
		int[] cnt = new int[id_list.length]; //�Ű� Ƚ�� ī��Ʈ�迭
		
		ArrayList<User> users = new ArrayList<User>(); 
		
		StringTokenizer st;
		for (int i = 0; i < report.length; i++) {
			st = new StringTokenizer(report[i]," ");
			String A = st.nextToken();//�Ű��ѻ��
			String B = st.nextToken();//�Ű���ѻ��
			
			User person = new User(A,B);
			if(!users.contains(person)){
				users.add(person);
				
			}
			
		}
		
	}

}
class User {
	String a,b;

	public User(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
}
