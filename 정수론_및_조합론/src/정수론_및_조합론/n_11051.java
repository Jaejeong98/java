package 정수론_및_조합론;

import java.util.*;

public class n_11051 {
	public static int [][]p=new int[1001][1001];
	public static int pas(int N, int K) {
		if(N==K||K==0)
			return 1;
		if(p[N][K]>0)
			return p[N][K];
		p[N][K]=pas(N-1,K-1)+pas(N-1,K);
		return p[N][K]%10007;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		System.out.println(pas(N,K));
	}
}
