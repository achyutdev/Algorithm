package rod_cut_problem;

public class RodCutProblemBottomup {
	int[] r ;
	int[] s	;
	@SuppressWarnings("unused")
	private void bottimUpCutRob(int[] p, int n) {

		int[] r = new int[n];
		int[] s = new int[n];
		r[0]=0;

		for (int 	j = 0; j < n; j++) {
			int q=-1;
			for (int i = 0; i < j; i++) {
				if(q<p[i]+r[j-i])
				{
					q=p[i]+r[j-1];
					s[j]=i;
				}

			}
			r[j]=q;
		}
	}

}
