import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

	public static String main(String arg) {
		// TODO Auto-generated method stub
		String result = null;
		ArrayList<Integer> unsorted = new ArrayList<Integer>();
		ArrayList<Integer> unsorted2 = new ArrayList<Integer>();
		
		String[] lines = arg.split(System.lineSeparator());
		for (String retval : lines[0].split(" ")) {
			unsorted.add(Integer.parseInt(retval));
		}
		for (String retval : lines[1].split(" ")) {
			unsorted2.add(Integer.parseInt(retval));
		}
		
		int[] toSort = new int[unsorted.size()];
		int[] toSort2 = new int[unsorted2.size()];
		
		
		
		//push in values to "toSort"
		for (int i = 0; i < unsorted.size(); i++) {
			toSort[i] = unsorted.get(i);
			toSort2[i] = unsorted2.get(i);
		}
		
		System.out.println("=====");
		quickSort(toSort,0, toSort.length -1);
		System.out.println("=====");
		quickSort(toSort2,0, toSort2.length -1);
		
		StringBuilder sb = new StringBuilder();
		for(int ret : toSort) {
			sb.append(ret);
			sb.append(" ");
		}
		result = sb.toString().trim();
		
		StringBuilder sb2 = new StringBuilder();
		for(int ret : toSort2) {
			sb2.append(ret);
			sb2.append(" ");
		}
		String result2 = sb2.toString().trim();
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("output.txt", "UTF-8");
			writer.println(result);
			writer.println(result2);
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
	
	private static void quickSort(int[] a, int left, int right){
		//System.out.println("left = " + left + " right = " + right + " pivotIndex = " +(left+right)/2);
		int pivotIndex = (left + right) / 2;
		int pivot = a[pivotIndex];
		int l = left, r = right;
		
		while(l <= r) {
			while(a[l] < pivot) {
				l++;
			}
			while(a[r] > pivot) {
				r--;
			}
			if(l <= r) {
				swap(a, l, r);
				l++;
				r--;
				System.out.println("Current array = " + Arrays.toString(a));
			}
			if(left < r) {
				quickSort(a,left,r);
			}
			if(right > l) {
				quickSort(a,l,right);	
			}
		}
	}
	
	private static final <T> void swap (int[] a, int i, int j) {
		int t = a[i];
		  a[i] = a[j];
		  a[j] = t;
	}

}
