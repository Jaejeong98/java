package ¼öÇÐ;

import java.util.*;

public class n_2747 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] fib=new int[n+1];
		for(int i=0; i<=n; i++) {
			if(i<2)
				fib[i]=i;
			else
				fib[i]=fib[i-2]+fib[i-1];
		}
		System.out.println(fib[n]);
	}
}
