package lab3pro4;

public class Lab3Problem4 {

	private static int[] array;
	public static void main(String[] args) {
		array = new int[] {1,2,0,2,1,2};
		sorting();
		for (int i : array) {
				System.out.print(i+"  ");
		}

	}
	public static void sorting(){
		int len =array.length;
		int a = 0;
		int b = 0;


		for (int i = 0; i < len; i++) {
			if(array[i]==0) a++;
			else if(array[i]==1) b++;

		}
		for (int i = 0; i < len; i++) {
			if(a!=0){
				array[i] = 0;
				a--;
			}
			else if(b!=0){
				array[i] =1;
				b--;
			}
			else array[i] =2;
		}
	}

}
