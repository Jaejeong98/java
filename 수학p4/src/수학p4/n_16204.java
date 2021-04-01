package ¼öÇĞp4;

import java.util.*;

public class n_16204 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		int min=Math.min(arr[0]-arr[1], arr[0]-arr[2]);
		System.out.println(Math.min(arr[1], arr[2])+min);
	}
}
