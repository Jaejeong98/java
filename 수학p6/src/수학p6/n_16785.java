package ¼öÇĞp6;

import java.util.*;

public class n_16785 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3], count=0, sum=0;
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		while(sum<arr[2]) {
			count++;
			sum+=arr[0];
			if(count%7==0)
				sum+=arr[1];
		}
		System.out.println(count);
	}
}
