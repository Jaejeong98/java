package ¼öÇÐp3;

import java.util.*;

public class n_13900 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long answer=0;
		int[] arr=new int[n+1], sum=new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i]=sc.nextInt();
			sum[i]=sum[i-1]+arr[i];
		}
		for(int i=0; i<n; i++) {
			long s=1l*arr[i]*(sum[n]-sum[i]);
			answer+=s;
		}
		System.out.println(answer);
	}
}
