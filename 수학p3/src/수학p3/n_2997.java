package ¼öÇĞp3;

import java.util.*;

public class n_2997 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int [3], arr2=new int [3];
		for(int i=0; i<2; i++) 
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		for(int i=1; i<3; i++)
			arr2[i]=arr[i]-arr[i-1];
		if(arr2[1]==arr2[2])
			System.out.println(arr[2]+arr2[1]);
		else {
			if(arr2[1]>arr2[2])
				System.out.println(arr[0]+arr2[2]);
			else
				System.out.println(arr[1]+arr2[1]);
		}
	}
}
