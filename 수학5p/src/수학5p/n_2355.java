package ¼öÇÐ5p;

import java.util.*;

public class n_2355 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n1=sc.nextLong(), n2=sc.nextLong();
		if(n1>n2) {
			long num=n1;
			n1=n2;
			n2=num;
		}
		long n=(n2+n1)*(n2-n1+1)/2;
		System.out.println(n);
	}
}