package ¼öÇĞ5p;

import java.util.*;

public class n_16479 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		if(arr[1]==arr[2])
			System.out.println((int)Math.pow(arr[0], 2));
		else {
			float n1=(float)(arr[2]-arr[1])/2, result=arr[0]*arr[0]-n1*n1;
			if(result%1==0)
				System.out.println((int)result);
			else
				System.out.println(result);
		}
	}
}
