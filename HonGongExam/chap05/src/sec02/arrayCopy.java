package sec02;

public class arrayCopy {

	public static void main(String[] args) {
		String[] oldStrArr = { "java", "array", "copy" };
		String[] newStrArr = new String[5];
		
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length );
		
		System.out.print("newStrArr = {");
		for (int i = 0; i<newStrArr.length;i++) {
			System.out.printf("%s ", newStrArr[i]);	
		}
		System.out.print("}");

		
	}

}
