package ¼öÇÐp4;

import java.util.*;

public class n_15633 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), sum=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				sum+=i;
		}
		System.out.println(sum*5-24);
	}
}
