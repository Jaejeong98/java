package ¼öÇĞp6;

import java.util.*;

public class n_22015 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[2]*2-(arr[1]+arr[0]));
	}
}