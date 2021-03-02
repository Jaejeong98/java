package ¼öÇÐp2;

import java.util.*;

public class n_9325 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			int S=sc.nextInt(), n=sc.nextInt(), sum=0;
			sum+=S;
			for(int j=0; j<n; j++) {
				int q=sc.nextInt(), p=sc.nextInt();
				sum+=q*p;
			}
			System.out.println(sum);
		}
	}
}
