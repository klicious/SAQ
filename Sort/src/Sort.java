import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 
 */

/**
 * @author Kwon
 *
 */
public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		String selectionSortInput = null;
		String insertSortInput = null;
		String mergeSortInput = null;
		String quickSortInput = null;
		//SelectionSort
		try (BufferedReader br = new BufferedReader(new FileReader ("selection_sort_input.txt"))){
			StringBuilder sb = new StringBuilder();
			
			while( (line = br.readLine()) != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
			}
			selectionSortInput = sb.toString();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// InsertSort
		try (BufferedReader br = new BufferedReader(new FileReader ("insert_sort_input.txt"))){
			StringBuilder sb = new StringBuilder();
			
			while( (line = br.readLine()) != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
			}
			insertSortInput = sb.toString();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		// MergeSort
		try (BufferedReader br = new BufferedReader(new FileReader ("merge_sort_input.txt"))){
			StringBuilder sb = new StringBuilder();
			
			while( (line = br.readLine()) != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				}					
			mergeSortInput = sb.toString();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// QuickSort
				try (BufferedReader br = new BufferedReader(new FileReader ("quick_sort_input.txt"))){
					StringBuilder sb = new StringBuilder();
					
					while( (line = br.readLine()) != null) {
						sb.append(line);
						sb.append(System.lineSeparator());
						}					
					quickSortInput = sb.toString();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		
		if (selectionSortInput == null) {
			System.out.println("Sort.java :: main() :: No strings read from selection_sort_input.txt thus HALTing....");
			return;
		}
		System.out.println("============================================");
		System.out.println("Selection Sort Called");
		System.out.println("============================================");
		SelectionSort.main(selectionSortInput);
		System.out.println("Sort.java :: main() :: Selection Sort : " +  verifyResult("output.txt", "selection_sort_expected_output.txt"));
		
		if (insertSortInput == null) {
			System.out.println("Sort.java :: main() :: No strings read from insert_sort_input.txt thus HALTing....");
			return;
		}
		System.out.println("============================================");
		System.out.println("Insert Sort Called");
		System.out.println("============================================");
		InsertSort.main(insertSortInput);
		System.out.println("Sort.java :: main() :: Insert Sort : " +  verifyResult("output.txt", "insert_sort_expected_output.txt"));
		
		if (mergeSortInput == null) {
			System.out.println("Sort.java :: main() :: No strings read from merge_sort_input.txt thus HALTing....");
			return;
		}
		System.out.println("============================================");
		System.out.println("Merge Sort Called");
		System.out.println("============================================");
		MergeSort.main(mergeSortInput);
		System.out.println("Sort.java :: main() :: Merge Sort : " +  verifyResult("output.txt", "merge_sort_expected_output.txt"));
		
		if (quickSortInput == null) {
			System.out.println("Sort.java :: main() :: No strings read from merge_sort_input.txt thus HALTing....");
			return;
		}
		System.out.println("============================================");
		System.out.println("Quick Sort Called");
		System.out.println("============================================");
		QuickSort.main(quickSortInput);
		System.out.println("Sort.java :: main() :: Quick Sort : " +  verifyResult("output.txt", "quick_sort_expected_output.txt"));
	}

	private static boolean verifyResult(String outputFile, String expectedOutputFile) {
		String output = "output";
		String expectedOutput = "expectedOutput";
		String line = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader (outputFile))){
			StringBuilder sb = new StringBuilder();
			
			while( (line = br.readLine()) != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
			}
			output = sb.toString();
			System.out.println("Sort.java :: verifyResult() :: output : " + System.lineSeparator() + output);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader (expectedOutputFile))){
			StringBuilder sb = new StringBuilder();
			
			while( (line = br.readLine()) != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
			}
			expectedOutput = sb.toString();
			System.out.println("Sort.java :: verifyResult() :: expected_output : " + System.lineSeparator() + expectedOutput);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return output.equals(expectedOutput);
	}
}
