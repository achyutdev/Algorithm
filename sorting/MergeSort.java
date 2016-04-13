package sorting;

public class MergeSort {

	public static void main(String[] args) {

	}
	int[] theArray;
	//public sorter


	public int[] sort(int[] input){
		int n = input.length;
		int[] tempStorage = new int[n];
		tempStorage = input;
		mergeSort(tempStorage,0,n-1);
		theArray = tempStorage;
		return theArray;
	}


	public void mergeSort(int[] temp, int lower, int upper) {
		if (lower == upper) {
			return;
		} else {
			int mid = (lower + upper) / 2;
			mergeSort(temp, lower, mid);
			mergeSort(temp, mid + 1, upper);
			merge(temp, lower, mid + 1, upper);
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

}
