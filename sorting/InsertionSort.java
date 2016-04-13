package sorting;

public class InsertionSort {

	private static int[] arr;

	public static void main(String[] args) {
		arr = new int[]{12,14,1,36,2,5,2};
		insertionSort();
		for (int i : arr) {
			System.out.print(" "+ i);
		}

	}

	public static void insertionSort(){
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int j = i;
			while( j>0 && value <arr[j-1]){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=value;
		}
	}

}
