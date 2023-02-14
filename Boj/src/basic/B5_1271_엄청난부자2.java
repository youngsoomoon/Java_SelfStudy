package basic;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class B5_1271_엄청난부자2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		BigInteger N = sc.nextBigInteger();
		BigInteger M = sc.nextBigInteger();

		BigInteger result = N.divide(M);
		BigInteger dummy = N.remainder(M);

		System.out.println(result);
		System.out.println(dummy);
	}
}
