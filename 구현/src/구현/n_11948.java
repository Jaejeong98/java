package ±¸Çö;

import java.util.*;

public class n_11948 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4], arr2[]=new int[2], max=0;
		for(int i=0; i<6; i++) {
			if(i<4)
				arr[i]=sc.nextInt();
			else
				arr2[i-4]=sc.nextInt();
		}
		Arrays.sort(arr);
		Arrays.sort(arr2);
		for(int i=1; i<4; i++)
			max+=arr[i];
		System.out.println(max+arr2[1]);
	}
}
