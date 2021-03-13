package ¼öÇÐp3;

import java.util.*;

public class n_14490 {
	public static int gcd(int n1, int n2) {
		if(n2==0)
			return n1;
		else
			return gcd(n2, n1%n2);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().split(":");
		int n1=Integer.parseInt(arr[0]), n2=Integer.parseInt(arr[1]), gcd_n=gcd(n1,n2);
		System.out.println(n1/gcd_n+":"+n2/gcd_n);
	}
}
