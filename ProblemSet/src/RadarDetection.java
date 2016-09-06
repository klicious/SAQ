import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class RadarDetection {
	/*
	 * ����
	 * 	�ر����ο��� ���Ӱ� ������ ���̴��� ��輱 ������ ��ġ�Ͽ���. ���̴��� ��ġ�� ��ġ C(x,y)�κ��� ������ �� �ִ� ������ �ݰ�(���� ������)�� r�̴�.
	 * 	���� ����
	 * 		n���� ���Դ밡 ħ���Ͽ��ٰ� �����Ѵ�. �� �Դ��� ���� ��ġ P1(x1,y1), P2(x2,y2), ... Pn(xn,yn)���� ���̴��� ������ �� �ִ� �ݰ����� ��� �� ���Դ��� ���� ã�ƶ�.
	 * 	�������
	 * 		���̴� ��ġ ��ġ �� ���Դ� ��ġ�� ��ǥ x,y�� 1<= x,y <= 500�̰�, ������ r�� 100���Ϸ� �ϰ�, ���Դ��� �� n�� 5 <= n <= 50 �̴�.
	 */
	public static void main(String arg) {
		/*
		 * INPUT variables 
		 * e.g) Radar Location (x,y) AND Radius r AND # of ships
		 * 		Location of Each Ships (x,y)
		 * 		5 5 3 7	
		 * 		1 3 2 5 4 4 3 8 3 5 5 7 6 8
		 */
		String line = arg.replaceAll(System.lineSeparator(), " ");
		
		String[] values = line.split(" ");
		int n = 0;
		
		Coordinate radar = new Coordinate(Integer.parseInt(values[n++].trim()), Integer.parseInt(values[n++].trim()));
		
		int r = Integer.parseInt(values[n++].trim());
		
		int nShips = Integer.parseInt(values[n++].trim());
		ArrayList<Coordinate> ships = new ArrayList<>();
		
		for(int i = 0; i < nShips; i++) {
			ships.add(new Coordinate(Integer.parseInt(values[n++].trim()),Integer.parseInt(values[n++].trim())));
			i++;
		}
		

		// check input
		System.out.println("===== Commencing Input Check =====");
		System.out.println("INPUT :: Radar(" + radar.x + "," + radar.y + ") : Radius = " + r + " : # of ships = " + nShips);
		for(int i = 0; i < ships.size(); i++) {
			System.out.println("Ship#" + i + " at (" + ships.get(i).x + "," + ships.get(i).y + ")");
		}
		System.out.println("==================================");

		/*
		 *  OUTPUT variables 
		 *  e.g) # of ships in the Radar
		 *  	4
		 */
		
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

class Coordinate {
	int x;
	int y;
	
	Coordinate() {
		init();
	}
	
	Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	private void init() {
		this.x = 0;
		this.y = 0;
	}
}