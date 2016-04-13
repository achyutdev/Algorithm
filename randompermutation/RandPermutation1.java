package randompermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandPermutation1 {

	public static void main(String[] args) {

		int[] array = randomPermutation(5);

		for (int i : array) {
			System.out.print(" "+i);
		}
	}
	public static int[] randomPermutation(int n){
		 int[] arr = new int[]{12,43,1,42};
		 Arrays.sort(arr);
		 for (int i : arr) {
			System.out.print(i);
		}
		int[] output = new int[n];
		int[] tracking=new int[n];
	
		

//		for(int i=0; i<n ; i++){
//			boolean validNumFound = false;
//			while(!validNumFound){
//				Random random = new Random();
//				int rand = random.nextInt(n);
//				if(tracking[rand]==0){
//					tracking[rand]=1;
//					validNumFound=true;
//					output[i]=rand;
//				}
//			}
//		}
		return output;
	}

}
