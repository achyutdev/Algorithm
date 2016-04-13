package sorting;

public class BubbleSorting2 {

	public static void main(String[] args) {
		for (int ele : bubblesorting(new int[] {6, 2,1,7,3,6,7,6 })) {
			System.out.print(ele + " ");
		}
	}

	public static int[] bubblesorting(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			boolean flag = false;
			for (int j = 0; j < len-i- 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					flag=true;
				}
			}
			if(!flag) break;
		}
		return a;
	}

}
