package ¼öÇÐp1;

import java.util.*;

public class n_1834 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt(), sum=0;
		for(int i=0; i<n; i++) {
			sum+=n*i+i;
		}
		System.out.println(sum);
	}
}
