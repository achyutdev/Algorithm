package rod_cut_problem;

import java.util.Arrays;

public class RodCutProblem{

	public int memoizedCutRod(int[] p, int n){
		int[] r = new int[n];
		Arrays.fill(r, -1);
		return memorizedCutRodAux(p,n,r);

	}

	private int memorizedCutRodAux(int[] p, int n, int[] r) {

		if(r[n]>= 0) return r[n];
		int q;
		if(n==0)
			q=0;
		else{
			q=-1;
			for(int i =0;i<n;i++){
				int result =p[i]+memorizedCutRodAux(p,n-i,r);
				if(q<result)
					q = result;
			}
		r[n]=q;
		}
		return q;
	}

	public static void main(String[] args) {
	}

}
