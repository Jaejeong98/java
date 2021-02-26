package ¼öÇÐp1;

import java.util.*;

public class n_11050 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		int T=1,B=1;
		for(int i=N; i>Math.max(K, N-K); i--) {
			T*=i;
		}
		for(int i=1; i<Math.max(K, N-K); i++) {
			B*=i;
		}
		System.out.println(T/B);
	}
}
