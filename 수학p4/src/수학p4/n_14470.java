package ¼öÇĞp4;

import java.util.*;

public class n_14470 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0; i<5; i++)
			arr[i]=sc.nextInt();
		if(arr[0]<0)
			System.out.println(Math.abs(arr[0])*arr[2]+arr[3]+arr[1]*arr[4]);
		else
			System.out.println((arr[1]-arr[0])*arr[4]);
	}
}
