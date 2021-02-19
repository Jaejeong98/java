package ¼öÇÐ;

import java.util.*;

public class n_10156 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt(), N=sc.nextInt(), M=sc.nextInt();
		if(K*N<M)
			System.out.println(0);
		else
			System.out.println(K*N-M);
	}
}
