package ¼öÇÐp4;

import java.util.*;

public class n_8974 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(), num=1;
		int[] arr=new int[n2+3];
		for(int i=1; num<=n2; i++) {
			for(int j=1; j<=i; j++) {
				if(num<=n2)
					arr[num++]=i;
			}
		}
		int sum=0;
		for(int i=n1; i<=n2; i++)
			sum+=arr[i];
		System.out.println(sum);
	}
}
