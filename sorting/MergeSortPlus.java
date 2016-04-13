package sorting;

public class MergeSortPlus {
	private int[] theArray;

	public int[] sort(int[] input) {
		int n = input.length;
		int[] tempStorage = new int[n];
		tempStorage = input;
		mergeSort(tempStorage, 0, n - 1);
		theArray = tempStorage;
		return theArray;
	}

	public void mergeSort(int[] temp, int lower, int upper) {
		if (lower == upper) {
			return;
		} else if (upper - lower < 20) {
			insertionSort(temp, lower, upper);

		} else {
			int mid = (lower + upper) / 2;
			mergeSort(temp, lower, mid);
			mergeSort(temp, mid + 1, upper);
			merge(temp, lower, mid + 1, upper);
		}
	}

	private void insertionSort(int[] temp, int lower, int upper) {
		int len = temp.length;
		for (int i = lower + 1; i < len; i++) {
			int value = theArray[i];
			int j = i;
			while (j > 0 && value < theArray[j - 1]) {
				theArray[j] = theArray[j - 1];
				j--;
			}
			theArray[j] = value;
		}
	}

	public void merge(int[] tempStorage, int lowerPointer, int upperPointer, int upperBound) {
		int j = 0; // tempStorage index
		int lowerBound = lowerPointer; // total number of elements to rearrange
		int n = upperBound - lowerBound + 1;
		// view the range [lowerBound,upperBound] as two arrays
		// [lowerBound, mid], [mid+1,upperBound] to be merged
		int mid = upperPointer - 1;
		while (lowerPointer <= mid && upperPointer <= upperBound) {
			if (theArray[lowerPointer] <= theArray[upperPointer]) {
				tempStorage[j++] = theArray[lowerPointer++];
			} else {
				tempStorage[j++] = theArray[upperPointer++];
			}
		}
		// left array may still have elements
		while (lowerPointer <= mid) {
			tempStorage[j++] = theArray[lowerPointer++];
		}
		// right array may still have elements
		while (upperPointer <= upperBound) {
			tempStorage[j++] = theArray[upperPointer++];
		}
		// replace the range [lowerBound,upperBound] in theArray with
		// the range [0,n-1] just created in tempStorage
		for (j = 0; j < n; ++j) {
			theArray[lowerBound + j] = tempStorage[j];
		}
	}

	// implementation

	public static void main(String[] args) {
		MergeSortPlus mergesort = new MergeSortPlus();
		int[] array = new int[] { 23, 4, 5, 2, 1, 5, 7, 9, 4, 5, 4, 34, 34, 6, 34, 75, 23, 64, 75, 24, 72, 22, 45, 31,
				12, 34, 575, 23, 755, 32, 23, 44 };
		int[] sorted = mergesort.sort(array);
		for (int i : sorted) {
			System.out.print(i + " ");
		}
	}

}
