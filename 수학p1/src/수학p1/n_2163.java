package 수학p1;

import java.util.*;

public class n_2163 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		System.out.println((N-1)+(M-1)*N);
	}
	/* 다른 코딩
	public static int count=0;
	public static void cho(int N, int M) {
		if(N==1) {
			N=M;
			M=1;
			if(M==1&&N==1)
				return;
		}
		count++;
		cho(N/2,M);
		cho(N-(N/2),M);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		cho(N,M);
		System.out.println(count);
	}*/
}
