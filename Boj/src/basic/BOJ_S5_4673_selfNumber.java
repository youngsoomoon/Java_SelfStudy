package basic;

public class BOJ_S5_4673_selfNumber {

	public static void main(String[] args) {
		boolean[] number = new boolean[10001];
		//첫번째 풀이(정답O)
//		for (int i = 1; i < number.length; i++) {
//			int dn = 0;
//			if (i<10) {
//				dn = i+i;
//				number[dn] = true;
//			}else if (i<100) {
//				dn = i+i/10+i%10;
//				number[dn] = true;
//			}else if (i<1000) {
//				dn = i+i/100+(i%100)/10+i%10;
//				number[dn] = true;
//			}else if (i<10000) {
//				dn = i+i/1000+(i%1000)/100+(i%100)/10+i%10;
//				if(dn>10000) continue;
//				number[dn] = true;
//			}
//		}
//		
//		for (int i = 1; i < number.length; i++) {
//			if(number[i]==false) System.out.println(i);
//		}
		//두번째 풀이(정답O, 함수 사용으로 깔끔)
		for (int i = 1; i < number.length; i++) {
			int dn = d(i);
			if(dn>10000||number[dn]) continue;
			number[dn] = true;
		}
		
		for (int i = 1; i < number.length; i++) {
			if(number[i]==false) System.out.println(i);
		}
		
	}

	private static int d(int n) {
		String str = Integer.toString(n);
		int sum = n;
		for (int j = 0; j < str.length(); j++) {
			sum += str.charAt(j)-'0';
		}
		return sum;
	}

}
