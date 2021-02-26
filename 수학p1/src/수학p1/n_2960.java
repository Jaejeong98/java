package ¼öÇÐp1;

import java.util.*;

public class n_2960 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		int count=0, j=2, p=1;
		int[] arr=new int[N+1];
		for(int i=2; i<=N; i++)
			arr[i]=i;
		while(true) {
			int mul=j*p;
			if(arr[mul]!=-1) {
				arr[mul]=-1;
				count++;
			}
			if(count==K)
				break;
			if(j*(p+1)<=N)
				p++;
			else {
				j++;
				p=1;
			}
		}
		System.out.println(j*p);
	}
}
