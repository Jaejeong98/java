package ¼öÇĞp6;

import java.util.*;

public class n_17874 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		int n1=arr[0]-arr[1], n2=arr[0]-arr[2];
		int result=Math.max(Math.max(arr[1]*arr[2],n1*arr[2]),Math.max(n2*arr[1],n1*n2));
		System.out.println(result*4);
	}
}
