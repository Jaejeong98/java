package ¼öÇĞ5p;

import java.util.*;

public class n_14913 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		if((arr[2] - arr[0]) % arr[1]!=0 || (arr[2]-arr[0]) / arr[1] < 0)
			System.out.println("X");
		else
			System.out.println((arr[2]-arr[0])/arr[1]+1);
	}
}
