package sec02;

public class two_dArray {

	public static void main(String[] args) {
		
		// 2행3열의 2차원배열 생성
		int [][] mathScores = new int[2][3];
		for (int i = 0; i<mathScores.length; i++) {
			for (int k = 0; k <mathScores[i].length; k++) {
				System.out.printf("mathScores[%d][%d]=%d\n",i,k,mathScores[i][k]);
			}
		}
		System.out.println();
		
		// 계단식 2차원배열 생성
		int [][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];

		for (int i = 0; i<englishScores.length; i++) {
			for (int k = 0; k <englishScores[i].length; k++) {
				System.out.printf("englishScores[%d][%d]=%d\n",i,k,englishScores[i][k]);
			}
		}
		System.out.println();
		
		// 값 목록으로 2차원배열 생성
		int[][] javaScores = { {95,80}, {92,96,80} };
		for (int i = 0; i<javaScores.length; i++) {
			for (int k = 0; k <javaScores[i].length; k++) {
				System.out.printf("javaScores[%d][%d]=%d\n",i,k,javaScores[i][k]);
			}
		}
	}

}
