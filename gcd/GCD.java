package gcd;

public class GCD {

	public static int gcd(int a, int b){
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public static void main(String...strings){
		System.out.println(gcd(18,12));
	}
}
