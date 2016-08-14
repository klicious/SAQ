import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

	public static String main(String args) {
		// TODO Auto-generated method stub
		
		if (args == null) {
			System.out.println("Must pass List to sort as String.");
			return "Failed";
		}
		
		String result = null;
		String everything = args;
		ArrayList<Integer> unsorted = new ArrayList<Integer>();
		
		System.out.println("::: Print Every Line :::");
		if (everything != null) {
			for(String retval : everything.split(System.lineSeparator())) {
				System.out.println(retval);
			}
		}
		System.out.println("::: Print word :::");
		if(everything != null) {
			for (String retval : everything.split(System.lineSeparator())) {
				for (String ret : retval.split(" ")) {
					System.out.println(ret);
					unsorted.add(Integer.parseInt(ret));
				}
			}
		}
		int[] toSort = new int[unsorted.size()];
		for (int i = 0; i < unsorted.size(); i++) {
			toSort[i] = unsorted.get(i);
			//System.out.println("SelectionSort.java :: main() :: toSort[" + i + "] <- unsorted[" + i +"] = " + unsorted.get(i)); 
		}
		
		int min, minIndex;
		for (int i = 0; i < toSort.length; i++) {
			min = toSort[i];
			minIndex = i;
			for (int j = i; j <toSort.length; j++) {
				if ( min > toSort[j]) {
					min = toSort[j];
					minIndex = j;
				}
			}
			swap(toSort, i, minIndex);
		}
		
		result = Arrays.toString(toSort).replaceAll("\\[|\\]|,", "");
		System.out.println("SelectionSort.java :: main() :: result : "+ System.lineSeparator() + result ); 
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("output.txt", "UTF-8");
			writer.println(result);
			writer.println("A");
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
	
	private static final <T> void swap (int[] a, int i, int j) {
		int t = a[i];
		  a[i] = a[j];
		  a[j] = t;
		}

}