package 정수론_및_조합론;

import java.util.*;

public class n_11050 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		int B=1, T=1;
		for(int i=N; i>Math.max(K, N-K); i--)
			T*=i;
		for(int i=1; i<=Math.min(K, N-K); i++)
			B*=i;
		System.out.println(T/B);
	}
}
