package ����p4;

import java.util.*;

public class n_12833 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		while(arr[2]!=0) {
			arr[0]^=arr[1];
			arr[2]--;
		}
		System.out.println(arr[0]);
	}
}
