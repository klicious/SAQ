import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Palindrome {

	/*
	 * 문제
	 * 	단어나 구, 문장 등을 뒤에서부터 읽어도 앞에서 읽어도 같은 것을 팰린드롬(Palindrome)이라 한다. 
	 * 	이탈리어로 뒤로 돌아가기란 말에서 유래된 말이다. 이 경우 낱말 사이의 띄어쓰기나 문장부호는 무시한다. 
	 * 	예를 들면, "구로구", "스위스, "김밥김"이 있고, 문장으로는 "다들잠들다", "다시합창합시다" 등이 있다.
	 * 	문제 제시
	 * 		입력된 긴 문자열에서 회문(Palindrome) 즉, 앞에서 읽든 뒤에서 읽든 같은 문자열 (예, EYE, SDS, RADAR 등)을 찾고, 찾은 회문의 개수를 출력하라.
	 * 	제약사항
	 * 		중복되는 문자열도 허용한다. (예를 들어 SDS, ASDSA인 경우 둘 다 출력)
	 */
	public static void main(String arg) {
		/*
		 * INPUT variables e.g) IAEFGSADAOFSOSPIPOKTOOTSCIVIC
		 */
		String[] line = arg.split(System.lineSeparator());
		String a = line[0].trim();

		// check input
		System.out.println("INPUT a :: " + a);

		// OUTPUT variables e.g) ADA SOS PIP TOOT IVI CIVIC / 6
		
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
