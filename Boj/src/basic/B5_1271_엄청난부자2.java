package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B5_1271_엄청난부자2 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int N = Integer.parseInt(st.nextToken());
	int M = Integer.parseInt(st.nextToken());
	int result;
	
	result = N / M;
	int dummy = N % M;
	
	System.out.println("result: "+result);
	System.out.println("dummy: "+dummy);
}
}
