package ±‚«œ«–;

import java.util.*;

public class n_8723 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for (int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		if(arr[0]==arr[2]) System.out.print(2);
		else if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2])
			System.out.print(1);
		else System.out.print(0);
	}
}
