package ¼öÇĞp3;

import java.util.*;

public class n_8320 {
	public static int prime(int n) {
		int num=0;
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n%i==0)
				num++;
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=1; i<=n; i++)
			arr[i]=arr[i-1]+prime(i);
		System.out.println(arr[n]);
	}
}
