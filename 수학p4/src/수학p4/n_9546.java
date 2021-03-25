package ¼öÇÐp4;

import java.util.*;

public class n_9546 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			int num=sc.nextInt();
			double sum=0;
			for(int j=1; j<=num; j++) {
				sum+=0.5;
				sum*=2;
			}
			System.out.println((int)sum);
		}
	}
}
