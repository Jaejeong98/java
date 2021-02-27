package ¼öÇÐp2;

import java.util.*;

public class n_5532 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		double A=sc.nextInt(), B=sc.nextInt();
		int C=sc.nextInt(), D=sc.nextInt();
		System.out.println(L-(int)Math.max(Math.ceil(A/C), Math.ceil(B/D)));
	}
}
