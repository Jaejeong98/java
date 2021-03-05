package ¼öÇÐp2;

import java.util.*;

public class n_1964 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long sum=5;
		for(int i=2; i<=n; i++) {
			sum+=i*3+1;
		}
		System.out.println(sum%45678);
	}
}
