import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DuplicateString {
	/*
	 * ����
	 * 	���� ����
	 * 		�Էµ� 2���� ���ڿ����� ���� ���ڿ� (��, 2�� �̻��� ������)�� ã��, ã�� ���ڿ��� ������� ����϶�.
	 * 	�������
	 * 		���ڿ��� ������ �ٹٲ����� �Ѵ�.
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