package ¼öÇĞp6;

import java.util.*;

public class n_15059 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6], sum=0;
		for(int i=0; i<6; i++)
			arr[i]=sc.nextInt();
		for(int i=0; i<3; i++) {
			if(arr[i+3]-arr[i]>0)
				sum+=arr[i+3]-arr[i];
			else
				continue;
		}
		System.out.println(sum);
	}
}
