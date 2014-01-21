
public class MergeSortedArrays {
	
	static int[] mergeArrays(int[] array1, int[] array2) {
		int[] mergedArray = new int[array1.length + array2.length];
		int i = 0, j = 0, k = 0;
		
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) {
				mergedArray[k] = array1[i];
				i++;
			} else {
				mergedArray[k] = array2[j];
				j++;
			}
			k++;
		}
		
		while (i < array1.length) {
			mergedArray[k] = array1[i];
			i++;
			k++;
		}

		while (j < array2.length) {
			mergedArray[k] = array2[j];
			j++;
			k++;
		}
		
		return mergedArray;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int[] array1 = {1,3,5,7,9};
		final int[] array2 = {2,4,6,8};
		
		int[] mergedArray = mergeArrays(array1, array2);
		
		for (int i : mergedArray) {
			System.out.print(i + ", ");
		}
	}

}
