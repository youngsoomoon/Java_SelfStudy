package sec02;

public class two_dArray {

	public static void main(String[] args) {
		
		// 2��3���� 2�����迭 ����
		int [][] mathScores = new int[2][3];
		for (int i = 0; i<mathScores.length; i++) {
			for (int k = 0; k <mathScores[i].length; k++) {
				System.out.printf("mathScores[%d][%d]=%d\n",i,k,mathScores[i][k]);
			}
		}
		System.out.println();
		
		// ��ܽ� 2�����迭 ����
		int [][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];

		for (int i = 0; i<englishScores.length; i++) {
			for (int k = 0; k <englishScores[i].length; k++) {
				System.out.printf("englishScores[%d][%d]=%d\n",i,k,englishScores[i][k]);
			}
		}
		System.out.println();
		
		// �� ������� 2�����迭 ����
		int[][] javaScores = { {95,80}, {92,96,80} };
		for (int i = 0; i<javaScores.length; i++) {
			for (int k = 0; k <javaScores[i].length; k++) {
				System.out.printf("javaScores[%d][%d]=%d\n",i,k,javaScores[i][k]);
			}
		}
	}

}
