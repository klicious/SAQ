import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Palindrome {

	/*
	 * ����
	 * 	�ܾ ��, ���� ���� �ڿ������� �о �տ��� �о ���� ���� �Ӹ����(Palindrome)�̶� �Ѵ�. 
	 * 	��Ż����� �ڷ� ���ư���� ������ ������ ���̴�. �� ��� ���� ������ ���⳪ �����ȣ�� �����Ѵ�. 
	 * 	���� ���, "���α�", "������, "����"�� �ְ�, �������δ� "�ٵ�����", "�ٽ���â�սô�" ���� �ִ�.
	 * 	���� ����
	 * 		�Էµ� �� ���ڿ����� ȸ��(Palindrome) ��, �տ��� �е� �ڿ��� �е� ���� ���ڿ� (��, EYE, SDS, RADAR ��)�� ã��, ã�� ȸ���� ������ ����϶�.
	 * 	�������
	 * 		�ߺ��Ǵ� ���ڿ��� ����Ѵ�. (���� ��� SDS, ASDSA�� ��� �� �� ���)
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
