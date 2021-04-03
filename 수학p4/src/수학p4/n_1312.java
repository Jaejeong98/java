package ¼öÇĞp4;

import java.util.*;

public class n_1312 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		int num=arr[0]%arr[1];
		for(int i=0; i<arr[2]-1; i++) {
			num*=10;
			num%=arr[1];
		}
		num*=10;
		System.out.println(num/arr[1]);
	}
}
