import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class RadarDetection {
	/*
	 * 문제
	 * 	해군본부에서 새롭게 개발한 레이더를 경계선 지역에 설치하였다. 레이더가 설치된 위치 C(x,y)로부터 감지할 수 있는 영역은 반경(원의 반지름)은 r이다.
	 * 	문제 제시
	 * 		n개의 적함대가 침투하였다고 가정한다. 적 함대의 현재 위치 P1(x1,y1), P2(x2,y2), ... Pn(xn,yn)에서 레이더로 감지할 수 있는 반경으로 들어 온 적함대의 수를 찾아라.
	 * 	제약사항
	 * 		레이더 배치 위치 및 적함대 위치의 좌표 x,y는 1<= x,y <= 500이고, 반지름 r은 100이하로 하고, 적함대의 수 n은 5 <= n <= 50 이다.
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
