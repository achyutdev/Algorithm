package merge;

public class Merge {
	public static void main(String[]str){
		int[] A = {2,4,6,7};
		int[] B = {1,4,7};

		int[] C = merge(A,B);
		for (int i : C) {
			System.out.print(i+ " ");
		}
	}

	static int[] merge(int[] arr1, int[] arr2){
		int len1 = arr1.length;
		int len2 = arr2.length;
		int len3 = len2+len1;
		int i=0;
		int j=0;
		int[] c = new int[len3];
		for (int count = 0; count < len3; count++) {
			if(i==len1){ c[count]=arr1[j];j++;}
			else if(j==len2){ c[count]=arr1[i];i++;}
			else{
				if(arr1[i]<arr2[j]){
				c[count]=arr1[i];
				i++;
			}
			else{
				c[count]=arr2[j];
				j++;
			}
		}}return c;

}
}
