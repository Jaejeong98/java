package ¼öÇÐp2;

import java.util.*;

public class n_15051 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(), n3=sc.nextInt();
		int r=Math.min(n2*2+n3*4, Math.min(n1*2+n3*2,n1*4+n2*2));
		System.out.println(r);
	}
}