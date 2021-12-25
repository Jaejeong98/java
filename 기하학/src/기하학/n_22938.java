package ±‚«œ«–;

import java.util.*;

public class n_22938 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0; i<6; i++) 
			arr[i]=sc.nextInt();
		System.out.println(Math.pow(arr[0]-arr[3], 2)+Math.pow(arr[1]-arr[4], 2)
		<Math.pow(arr[2]+arr[5], 2)?"YES":"NO");
	}
}
