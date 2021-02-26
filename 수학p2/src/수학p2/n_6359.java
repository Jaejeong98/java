package ¼öÇÐp2;

import java.util.*;

public class n_6359 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int m=0; m<t; m++) {
			int n=sc.nextInt() , count=0;
			boolean[] arr=new boolean[n+1];
			for(int i=1;i<=n; i++) {
				for(int j=1; j*i<=n; j++) {
					if(arr[i*j]==true)
						arr[i*j]=false;
					else
						arr[i*j]=true;
				}
			}
			for(int k=1; k<=n; k++) {
				if(arr[k]==true)
					count++;
			}
			System.out.println(count);
		}
	}
}
