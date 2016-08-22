import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

	public static void main(String arg) {
		
		String result = null;
		ArrayList<Integer> unsorted = new ArrayList<Integer>();
		
		String[] lines = arg.split(System.lineSeparator());
		for (String retval : lines[1].split(" ")) {
			unsorted.add(Integer.parseInt(retval));
		}

		int numOfInput = Integer.parseInt(lines[0].trim());
		
		int[] toSort = new int[unsorted.size()];
		
		//push in values to "toSort"
		for (int i = 0; i < unsorted.size(); i++) {
			toSort[i] = unsorted.get(i);
		}
		
		mergeSort(toSort);
		
		StringBuilder sb = new StringBuilder();
		for(int ret : toSort) {
			sb.append(ret);
			sb.append(" ");
		}
		result = sb.toString().trim();
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("output.txt", "UTF-8");
			writer.println(result);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			writer.close();
		}
	}
	
	private static void mergeSort(int[] a) {
		System.out.println("initial a.length = " + a.length);
		int[] temp = new int[a.length];
		mergeSort(a, temp, 0, a.length -1);
	}
	
	private static void mergeSort(int[] a, int[] temp, int left, int right) {
		if(left < right) {
			int center = (left + right) / 2;
			mergeSort(a, temp, left, center);
			mergeSort(a, temp, center + 1, right);
			merge(a, temp, left, center + 1, right);
		}
	}
	
	private static void merge(int[] a, int[] temp, int left, int right, int rightEnd) {
		int leftEnd = right - 1;
		int tempIndex = left;
		int arrayLength = rightEnd - left + 1;
		
		while (left <= leftEnd && right <= rightEnd) {
			
			if(a[left] < a[right]) {
				temp[tempIndex++] = a[left++];	
			} else {
				temp[tempIndex++] = a[right++];
			}
			
		}
		
		//proceed rest of the left/right into the array
		while(left <= leftEnd) {
			temp[tempIndex++] = a[left++];
		}
		while(right <= rightEnd) {
			temp[tempIndex++] = a[right++];
		}
		
		//System.out.println("=====");
		// copy temp array back into the original array
		for(int i = 0; i < arrayLength; i++, rightEnd--) {
			//System.out.println("i = " + i + " left = " + left + " rightEnd = " + rightEnd + " arrayLength = " + arrayLength);
			a[rightEnd] = temp[rightEnd];
		}
		
		// INDICATION
		System.out.println("============================================");
		System.out.println("Current arrayLength = " + arrayLength);
		System.out.println("Current orig[] = " + Arrays.toString(a));
		System.out.println("Current temp[] = " + Arrays.toString(temp));
		System.out.println("============================================");
	}

}
