package ¼öÇÐp4;

import java.util.*;

public class n_15726 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n1=sc.nextDouble(), n2=sc.nextDouble(), n3=sc.nextDouble();
		double re1=n1/n2*n3, re2=n1*n2/n3;
		System.out.println((int)Math.max(re1, re2));
	}
}
