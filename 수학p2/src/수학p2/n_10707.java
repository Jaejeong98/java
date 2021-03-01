package ¼öÇĞp2;

import java.util.*;

public class n_10707 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0; i<5; i++) 
			arr[i]=sc.nextInt();
		int pay=arr[1];
		if(arr[2]<arr[4])
			pay+=arr[3]*(arr[4]-arr[2]);
		if(arr[0]*arr[4]>pay)
			System.out.println(pay);
		else
			System.out.println(arr[0]*arr[4]);
	}
}
