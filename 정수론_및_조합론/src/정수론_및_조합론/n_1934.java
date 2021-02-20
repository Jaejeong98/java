package 정수론_및_조합론;

import java.util.*;

public class n_1934 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			int A=sc.nextInt(), B=sc.nextInt();
			System.out.println(A*(B/gcd(A,B)));
		}
	}
}
