package ¼öÇĞp2;

import java.util.*;

public class n_2959 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[0]*arr[2]);
	}
}
