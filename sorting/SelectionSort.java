package sorting;

public class SelectionSort {

	private static int[] arr;

	public static void main(String[] str){
		arr= new int[]{12,2,5,2,67,23,4};
		selectionsort();
		for (int i : arr) {
			System.out.print("  " + i);
		}

	}

	public static void selectionsort(){
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int minPos = minPosition(i, len-1);
			if(arr[i]>arr[minPos]){
				swap(i, minPos);
			}
		}
	}

	public static void swap(int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j]= tmp;
	}

	public static int minPosition(int strtPoint,int end){
		int minPos=strtPoint;
		int minValue = arr[strtPoint];
		for(int i = strtPoint+1; i <=end; i++){
			if(arr[i]<minValue){
				minPos=i;
				minValue = arr[i];
			}
		}
		return minPos;
	}
}
