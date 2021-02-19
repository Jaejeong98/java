package ¼öÇĞ;

import java.util.*;

public class n_2875 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), K=sc.nextInt();
		int count=0;
		while(N>=2&&M>=1&&N+M>=3+K) {
			N-=2;
			M--;
			count++;
		}
		System.out.println(count);
	}
}
