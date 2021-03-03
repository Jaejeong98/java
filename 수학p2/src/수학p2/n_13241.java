package ¼öÇÐp2;

import java.util.*;

public class n_13241 {
	public static long gcd(long n1, long n2) {
		if(n2==0)
			return n1;
		else
			return gcd(n2, n1%n2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n1=sc.nextLong(), n2=sc.nextLong();
		System.out.println(n1*n2/gcd(n1,n2));
	}
}
