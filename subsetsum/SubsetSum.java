package subsetsum;

public class SubsetSum {

	public static boolean subSetDP(int[] A, int sum) {
		boolean[][] solution = new boolean[A.length + 1][sum + 1];
		// if sum is not zero and subset is 0, we can't make it
		for(int i=1;i<=sum;i++){
			solution[0][i]=false;
		}
		// if sum is 0 the we can make the empty subset to make sum 0
				for(int i=0;i<=A.length;i++){
					solution[i][0]=true;
				}
		//
		for(int i=1;i<=A.length;i++){
			for(int j=1;j<=sum;j++){
				//first copy the data from the top
				solution[i][j] = solution[i-1][j];

				//If solution[i][j]==false check if can be made
				if(solution[i][j]==false && j>=A[i-1])
					solution[i][j] = solution[i][j] || solution[i-1][j-A[i-1]];
			}
		}
		return solution[A.length][sum];
	}

	public static void main(String[] args) {
		int[] A = { 3, 2, 7, 1};
		System.out.println("\nFrom DP: " + subSetDP(A, 6) );
	}
}
/*
public class AllCombinations {

static int[] B = { 1, 2, 3 };

public void combinations(int[] A, int x) {
	if (x == A.length - 1) {
		A[x] = 0; // last digit, don't select it
		printArray(A); // print the set
		A[x] = 1; //// last digit, select it
		printArray(A);
		return;
	}
	A[x] = 0;   //either you will not select this digit
	combinations(A, x + 1);
	A[x] = 1;  //either you will select this digit
	combinations(A, x + 1);
}

public void printArray(int[] A) {
	boolean isNULL = true;
	System.out.print("{");
	for (int i = 0; i < B.length; i++) {
		if (A[i] == 1) {
			System.out.print(B[i] + "");
			isNULL = false;
		}
	}
	if (isNULL == false) {
		System.out.print("}");
		System.out.print("  ");
	}

	if (isNULL) {
		System.out.print("Empty");
		System.out.print("} ");
	}
}

public static void main(String[] args) {
	AllCombinations a = new AllCombinations();
	int[] A = new int[B.length];
	a.combinations(A, 0);

}

}*/