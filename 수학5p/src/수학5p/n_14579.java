package ¼öÇÐ5p;

import java.util.*;

public class n_14579 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(), sum=0, result=1;
		for(int i=1; i<n1; i++)
			sum+=i;
		for(int i=n1; i<=n2; i++) {
			sum+=i;
			result*=sum%14579;
			result%=14579;
		}
		System.out.print(result);
	}
}
