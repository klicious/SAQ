import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class InsertSort {

	public static String main(String arg) {
		// TODO Auto-generated method stub
		String result = null;
		ArrayList<Integer> unsorted = new ArrayList<Integer>();
		
		String[] lines = arg.split(System.lineSeparator());
		for (String retval : lines[0].split(" ")) {
			unsorted.add(Integer.parseInt(retval));
		}

		int input = Integer.parseInt(lines[1]);
		int[] toSort = new int[unsorted.size()];
		
		/*unsorted.sort(null);
		System.out.println("I WILL BE PRINTING");
		for (int i = 0; i < unsorted.size(); i++) {
			System.out.print(unsorted.get(i) + " ");
		}
		System.out.println("");*/
		System.out.println("toSort = " + Arrays.toString(toSort));
		System.out.println("unsorted = " + unsorted.toString());
		toSort[0] = unsorted.get(0);
		boolean replaced = false;
		for (int i = 1; i< unsorted.size(); i++) {
			replaced = false;
			int cur = unsorted.get(i);
			System.out.println("cur is " + cur);
			for (int j = 0; j < i; j++) {
				if ( toSort[j] > cur ) {
					for (int k = i; k > j; k--) {
						toSort[k] = toSort[k-1];
					}
					toSort[j] = cur;
					replaced = true;
					break;
				}
				System.out.println("in Loop" + " :: toSort = " + Arrays.toString(toSort));
			}
			if(replaced != true) {
				toSort[i] = cur;
			}
		}
		String test = Arrays.toString(toSort);
		System.out.println("This is the test result of Insert Sort : " + test);
		
		StringBuilder sb = new StringBuilder();
		
		for (int ret: toSort){
			sb.append(String.valueOf(ret));
			sb.append(" ");
		}
		
		result = sb.toString().trim();
		int index = -1;
		for (int i = 0; i < toSort.length; i++) {
			if(toSort[i] == Integer.parseInt(lines[1])) {
				index = i;
			}
		}
		
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("output.txt", "UTF-8");
			writer.println(result);
			writer.println(index + 1);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			writer.close();
		}
		
		return result;
	}

}
