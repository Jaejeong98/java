package ¼öÇĞ5p;

import java.util.*;

public class n_15734 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		if(Math.abs(arr[0]-arr[1])>arr[2])
			System.out.println((Math.min(arr[0], arr[1])+arr[2])*2);
		else {
			if(arr[0]==arr[1])
				System.out.println((arr[0]+arr[2]/2)*2);
			else {
				arr[2]-=Math.abs(arr[0]-arr[1]);
				System.out.println((Math.max(arr[0], arr[1])+arr[2]/2)*2);
			}
		}
	}
}
