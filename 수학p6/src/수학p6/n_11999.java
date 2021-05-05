package ¼öÇĞp6;

import java.util.*;

public class n_11999 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		int max=0;
		for(int i=0; i<=arr[2]; i++) {
			for(int j=0; j<=arr[2]; j++) {
				int num=arr[0]*i+arr[1]*j;
				if(num<=arr[2])
					max=Math.max(num, max);
			}
		}
		System.out.println(max);
	}
}
