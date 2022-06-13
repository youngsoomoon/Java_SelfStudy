package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//그리디
public class BOJ_1931_S1_회의실배정 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Meeting> meeting = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			Meeting m = new Meeting(start, end);
			meeting.add(m);
		}
		Collections.sort(meeting);
		
		int time = 0;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int start = meeting.get(i).start;
			int end = meeting.get(i).end;
			if(start>=time) {
				cnt++;
				time = end;
			}
		}
		
		System.out.println(cnt);
		
		
	}
}
class Meeting implements Comparable<Meeting>{
	int start;
	int end;
	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(Meeting o) {
		if(this.end == o.end) {
			return this.start - o.start;
		}
		return this.end - o.end;
	}
	
}
