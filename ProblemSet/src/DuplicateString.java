import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DuplicateString {
	/*
	 * 문제
	 * 	문제 제시
	 * 		입력된 2개의 문자열에서 같은 문자열 (단, 2개 이상의 영문자)를 찾고, 찾은 문자열이 몇개인지를 출력하라.
	 * 	제약사항
	 * 		문자열의 구분은 줄바꿈으로 한다.
	 */
	public static void main(String arg) {
		/*
		 * INPUT variables e.g) SAQLANGUAGEOFCOMPUTER / SOFTWAREPROGRAMMING
		 */
		String[] line = arg.split(System.lineSeparator());
		String a = line[0].trim();
		String b = line[0].trim();

		// check input
		System.out.println("INPUT a :: " + a);
		System.out.println("INPUT b :: " + b);

		// OUTPUT variables e.g) OF NG / 2
		
		// write to output file
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("output.txt", "UTF-8");
			writer.println();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} finally {
			writer.close();
		}

	}

}
