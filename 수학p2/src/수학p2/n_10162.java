package ¼öÇÐp2;

import java.util.*;

public class n_10162 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), A = 0, B = 0, C = 0;
		if(T%10!=0)
			System.out.println(-1);
		else {
			A=T/300;
			B=(T%300)/60;
			C=(T%300)%60/10;
			System.out.println(A+" "+B+" "+C);
		}
	}
}
