package ¼öÇÐp2;

import java.util.*;

public class n_1292 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt();
		int sum=0, count=0;
		for(int i=1; i<1000; i++) {
			for(int j=1; j<=i; j++) {
				count++;
				if(count>=A&&count<=B)
					sum+=i;
				if(count>B)
					break;
			}
		}
		System.out.println(sum);
	}
}
